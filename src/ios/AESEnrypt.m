//
//  AESEnrypt.m
//  demo
//
//  Created by zhshw on 16/9/9.
//  Copyright © 2016年 zhshw. All rights reserved.
//

#import "AESEnrypt.h"
#import <CommonCrypto/CommonCryptor.h>
#import <CommonCrypto/CommonKeyDerivation.h>
#import <Security/Security.h>

@implementation AESEnrypt


+ (NSData*)encryptData:(NSData*)data key:(NSData*)key;
{
    return [AESEnrypt encryptData:data key:key iv:key];

}

+ (NSData*)encryptData:(NSData*)data key:(NSData*)key iv:(NSData*)iv
{
    NSData* result = nil;

    // setup key
    unsigned char cKey[FBENCRYPT_KEY_SIZE];
    bzero(cKey, sizeof(cKey));
    [key getBytes:cKey length:FBENCRYPT_KEY_SIZE];

    // setup iv
    char cIv[FBENCRYPT_BLOCK_SIZE];
    bzero(cIv, FBENCRYPT_BLOCK_SIZE);
    if (iv) {
        [iv getBytes:cIv length:FBENCRYPT_BLOCK_SIZE];
    }

    // setup output buffer
    size_t bufferSize = [data length] + FBENCRYPT_BLOCK_SIZE;
    void *buffer = malloc(bufferSize);

    // do encrypt
    size_t encryptedSize = 0;
    CCCryptorStatus cryptStatus = CCCrypt(kCCEncrypt,
                                          FBENCRYPT_ALGORITHM,
                                          kCCOptionPKCS7Padding,
                                          cKey,
                                          FBENCRYPT_KEY_SIZE,
                                          cIv,
                                          [data bytes],
                                          [data length],
                                          buffer,
                                          bufferSize,
                                          &encryptedSize);
    if (cryptStatus == kCCSuccess) {
        result = [NSData dataWithBytesNoCopy:buffer length:encryptedSize];
    } else {
        free(buffer);
        NSLog(@"[ERROR] failed to encrypt|CCCryptoStatus: %d", cryptStatus);
    }

    return result;
}

+ (NSData*)decryptData:(NSData*)data key:(NSData*)key
{
    return [AESEnrypt decryptData:data key:key iv:key];
}
+ (NSData*)decryptData:(NSData*)data key:(NSData*)key iv:(NSData*)iv
{
    NSData* result = nil;

    // setup key
    unsigned char cKey[FBENCRYPT_KEY_SIZE];
    bzero(cKey, sizeof(cKey));
    [key getBytes:cKey length:FBENCRYPT_KEY_SIZE];

    // setup iv
    char cIv[FBENCRYPT_BLOCK_SIZE];
    bzero(cIv, FBENCRYPT_BLOCK_SIZE);
    if (iv) {
        [iv getBytes:cIv length:FBENCRYPT_BLOCK_SIZE];
    }

    // setup output buffer
    size_t bufferSize = [data length] + FBENCRYPT_BLOCK_SIZE;
    void *buffer = malloc(bufferSize);

    // do decrypt
    size_t decryptedSize = 0;
    CCCryptorStatus cryptStatus = CCCrypt(kCCDecrypt,
                                          FBENCRYPT_ALGORITHM,
                                          kCCOptionPKCS7Padding,
                                          cKey,
                                          FBENCRYPT_KEY_SIZE,
                                          cIv,
                                          [data bytes],
                                          [data length],
                                          buffer,
                                          bufferSize,
                                          &decryptedSize);

    if (cryptStatus == kCCSuccess) {
        result = [NSData dataWithBytesNoCopy:buffer length:decryptedSize];
    } else {
        free(buffer);
        NSLog(@"[ERROR] failed to decrypt| CCCryptoStatus: %d", cryptStatus);
    }

    return result;
}
+ (NSString *) cleanNonHexCharsFromHexString:(NSString *)input
{
    if (input == nil) {
        return nil;
    }

    NSString * output = [input stringByReplacingOccurrencesOfString:@"0x" withString:@""
                                                            options:NSCaseInsensitiveSearch range:NSMakeRange(0, input.length)];
    NSString * hexChars = @"0123456789abcdefABCDEF";
    NSCharacterSet *hexc = [NSCharacterSet characterSetWithCharactersInString:hexChars];
    NSCharacterSet *invalidHexc = [hexc invertedSet];
    NSString * allHex = [[output componentsSeparatedByCharactersInSet:invalidHexc] componentsJoinedByString:@""];
    return allHex;
}
+ (NSData *) dataFromHexString:(NSString*)hexString
{
    NSString * cleanString = [AESEnrypt cleanNonHexCharsFromHexString:hexString];
    if (cleanString == nil) {
        return nil;
    }

    NSMutableData *result = [[NSMutableData alloc] init];

    int i = 0;
    for (i = 0; i+2 <= cleanString.length; i+=2) {
        NSRange range = NSMakeRange(i, 2);
        NSString* hexStr = [cleanString substringWithRange:range];
        NSScanner* scanner = [NSScanner scannerWithString:hexStr];
        unsigned int intValue;
        [scanner scanHexInt:&intValue];
        unsigned char uc = (unsigned char) intValue;
        [result appendBytes:&uc length:1];
    }
    NSData * data = [NSData dataWithData:result];
    return data;
}
+ (NSString *)hexStringFromData:(NSData *)data {
    Byte *bytes = (Byte *)[data bytes];
    // 下面是Byte 转换为16进制。
    NSString *hexStr = @"";
    for(int i=0; i<[data length]; i++) {
        NSString *newHexStr = [NSString stringWithFormat:@"%x",bytes[i] & 0xff]; //16进制数
        newHexStr = [newHexStr uppercaseString];

        if([newHexStr length] == 1) {
            newHexStr = [NSString stringWithFormat:@"0%@",newHexStr];
        }

        hexStr = [hexStr stringByAppendingString:newHexStr];

    }
    return hexStr;
}

+(NSData *)getFixHeadBuf:(int)len command:(int) command seq:(int)seq{
    Byte arrayOfByte[8];
    arrayOfByte[0] = -2;
    arrayOfByte[1] = 1;
    arrayOfByte[2] = ((Byte) (len >> 8 & 0xFF));
    arrayOfByte[3] = ((Byte) (len & 0xFF));
    arrayOfByte[4] = ((Byte) (command >> 8 & 0xFF));
    arrayOfByte[5] = ((Byte) (command & 0xFF));
    arrayOfByte[6] = ((Byte) (seq >> 8 & 0xFF));
    arrayOfByte[7] = ((Byte) (seq & 0xFF));

    return [NSData dataWithBytes:arrayOfByte length:8];

}
+(int)getCmdId:(NSData *)paramData{
    Byte *arrayByte = (Byte *)[paramData bytes];
    int j = -1;
    int i = j;
    Byte temp=(Byte)(0XFF & -2);
    if (arrayByte[0] ==temp) {
        i = j;
        if (arrayByte[1] == 1) {
            i = (arrayByte[4] << 8) + arrayByte[5];
        }
    }
    return i;
}
+(int)getCmdIdBytes:(Byte *)arrayByte{
    int j = -1;
    int i = j;
    Byte temp=(Byte)(0XFF & -2);
    if (arrayByte[0] ==temp) {
        i = j;
        if (arrayByte[1] == 1) {
            i = (arrayByte[4] << 8) + arrayByte[5];
        }
    }
    return i;
}
@end
