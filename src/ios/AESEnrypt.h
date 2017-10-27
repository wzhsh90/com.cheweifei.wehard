//
//  AESEnrypt.h
//  HelloCordova
//
//  Created by zhshw on 16/9/23.
//
//

#import <CommonCrypto/CommonCryptor.h>
#import <Foundation/Foundation.h>

#define FBENCRYPT_ALGORITHM     kCCAlgorithmAES128
#define FBENCRYPT_BLOCK_SIZE    kCCBlockSizeAES128
#define FBENCRYPT_KEY_SIZE      kCCKeySizeAES128

@interface AESEnrypt : NSObject


+ (NSData *) dataFromHexString:(NSString*)hexString;
+ (NSData*)encryptData:(NSData*)data key:(NSData*)key;
+ (NSData*)decryptData:(NSData*)data key:(NSData*)key;
+ (NSString *)hexStringFromData:(NSData *)data;
+(NSData *)getFixHeadBuf:(int )len command:(int) command seq:(int)seq;
+(int)getCmdId:(NSData *)paramData;
+(int)getCmdIdBytes:(Byte *)arrayByte;

@end
