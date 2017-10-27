
#import "WeHardPlugin.h"
#import "AESEnrypt.h"
#import "MmBp.pb.h"
#import "NSData+CRC32.h"

@implementation WeHardPlugin


- (void)receiveData:(CDVInvokedUrlCommand*)command
{
    NSData *byteData=[command argumentAtIndex:0];
    NSString *sessionKey=[command argumentAtIndex:1];
    NSString *aesKey=[command argumentAtIndex:2];
    Byte *arrayByte = (Byte *)[byteData bytes];
    int len=(int)[byteData length];
    int bodyLen=len-HEAD_LEN;
    Byte headByte[HEAD_LEN];
    Byte bodyByte[bodyLen];
    memcpy(&headByte, &arrayByte[0], HEAD_LEN);
    memcpy(&bodyByte, &arrayByte[HEAD_LEN], bodyLen);
    int headCommand=[self getCmdIdBytes:headByte];
    [self analyComand:headCommand bodyData:bodyByte bodyLen:bodyLen sessionKey:sessionKey aesKey:aesKey  backid:[command callbackId]];

}
-(void) analyComand:(int)headCommand bodyData:(Byte *)bodyData  bodyLen:(int )bodyLen sessionKey:(NSString *)sessionKey aesKey:(NSString *)aesKey backid:(NSString *)callbackId{

    switch (headCommand) {
        case 0:
            break;
        case 10001:
            [self authReq:headCommand bodyData:bodyData bodyLen:bodyLen sessionKey:sessionKey aesKey:aesKey backid:callbackId];
            break;
        case 10002:
            [self initDataReq:headCommand bodyData:bodyData bodyLen:bodyLen sessionKey:sessionKey backid:callbackId];
            break;
        case 10003:
            [self initReq:headCommand bodyData:bodyData bodyLen:bodyLen sessionKey:sessionKey backid:callbackId];
            break;
        default:
            break;
    }

}
-(void) randomSessionKey{

    NSMutableString *muStr=[[NSMutableString alloc]init];
    NSString *keyStr=@"ABCDEF0123456789";
    for(int i=0;i<16;i++){
        int index = arc4random() % 16;
        unichar charStr=[keyStr characterAtIndex:index];
        [muStr appendFormat:@"0%C",charStr];
    }
    self.SESSION_KEY=[self dataFromHexString:muStr];
}
-(void) authReq:(int)headCommand bodyData:(Byte *)bodyData bodyLen:(int )bodyLen sessionKey:(NSString *)sessionKey aesKey:(NSString *)aesKey backid:(NSString *)callbackId{
    //    NSData *authReqData=[NSData dataWithBytes:bodyData length:bodyLen];
    //    AuthRequest *authReqObj=[AuthRequest parseFromData:authReqData];
    [self randomSessionKey];
    AuthResponseBuilder *authRespBuilder=[AuthResponse builder];
    [authRespBuilder setBaseResponse:[[[BaseResponse builder] setErrCode:0 ] build ]];

    NSData *AES_KEY=[self dataFromHexString:aesKey];
    NSData *encryptSessionKey=[AESEnrypt encryptData:self.SESSION_KEY key:AES_KEY];

    [authRespBuilder setAesSessionKey:encryptSessionKey];

    AuthResponse *respObj=[authRespBuilder build];

    NSData *outData =respObj.data;

    NSMutableData * allData = [self getAllData:outData command:EmCmdIdEciRespAuth seq:1];

    NSMutableDictionary *dic=[[NSMutableDictionary alloc]init];
    [dic setObject:[NSNumber numberWithInt:headCommand] forKey:@"cmd"];
    [dic setObject:@"" forKey:@"recvData"];
    [dic setObject:[allData base64EncodedStringWithOptions:0] forKey:@"respData"];

    CDVPluginResult *pluginResult = nil;
    pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsDictionary:dic];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];

}
-(void) initDataReq:(int)headCommand bodyData:(Byte *)bodyData bodyLen:(int )bodyLen sessionKey:(NSString *)sessionKey backid:(NSString *)callbackId{

    NSData *reqData=[NSData dataWithBytes:bodyData length:bodyLen];

    SendDataRequest *reqObj=[SendDataRequest parseFromData:[AESEnrypt decryptData:reqData key:self.SESSION_KEY]];
    NSData *recvData=[reqObj datan];
    NSUInteger recvDataLen=[recvData length];
    NSData *recvDataPart=[recvData subdataWithRange:NSMakeRange(SEND_DATA_HEAD_LEN, recvDataLen-SEND_DATA_HEAD_LEN)];

    NSString *recvDataStr = [[NSString alloc] initWithData:recvDataPart encoding:NSUTF8StringEncoding];

    SendDataResponseBuilder *respBuilder=[SendDataResponse builder];
    if([recvDataStr isEqualToString:@"verifyID"]){
        [respBuilder setDatan:[sessionKey dataUsingEncoding:NSUTF8StringEncoding]];
    }else{
        [respBuilder setDatan:[self dataFromHexString:@"01"]];
    }

    [respBuilder setBaseResponse:[[[BaseResponse builder] setErrCode:0 ] build ]];

    SendDataResponse *respObj=[respBuilder build];
    NSData *pushData=respObj.data;
    NSData *outData =[AESEnrypt encryptData:pushData key:self.SESSION_KEY];
    NSMutableData * allData = [self getAllData:outData command:EmCmdIdEciRespSendData seq:0];
    NSMutableDictionary *dic=[[NSMutableDictionary alloc]init];
    [dic setObject:[NSNumber numberWithInt:headCommand] forKey:@"cmd"];
    [dic setObject:recvDataStr forKey:@"recvData"];
    [dic setObject:[allData base64EncodedStringWithOptions:0] forKey:@"respData"];

    CDVPluginResult *pluginResult = nil;
    pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsDictionary:dic];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];

}
-(NSMutableData *) getAllData:(NSData *) bodyData command:(int)command seq:(int)seq{
    NSMutableData * allData = [[NSMutableData alloc] init];
    int len=(int)[bodyData length]+8;
    NSData *respHeadData=[self getFixHeadBuf:len command:command seq:seq];
    [allData appendData:respHeadData];
    [allData appendData:bodyData];

    return allData;
}

-(void) initReq:(int)headCommand bodyData:(Byte *)bodyData bodyLen:(int )bodyLen sessionKey:(NSString *)sessionKey backid:(NSString *)callbackId{

    NSData *reqData=[NSData dataWithBytes:bodyData length:bodyLen];
    InitRequest *reqObj=[InitRequest parseFromData:[AESEnrypt decryptData:reqData key:self.SESSION_KEY]];
    InitResponseBuilder *respBuilder=[InitResponse builder];
    [respBuilder setChalleangeAnswer:[reqObj challenge].crc32];
    [respBuilder setUserIdHigh:4660];
    [respBuilder setUserIdLow:22136];
    [respBuilder setTime:0];
    [respBuilder setTimeZone:0];
    [respBuilder setAutoSyncMaxDurationSecond:0];
    [respBuilder setPlatformType:EmPlatformTypeEptIos];
    [respBuilder setInitScence:EmInitScenceEisDeviceChat];
    [respBuilder setBaseResponse:[[[BaseResponse builder] setErrCode:0 ] build ]];

    InitResponse *respObj=[respBuilder build];
    NSData *pushData=respObj.data;
    NSData *outData =[AESEnrypt encryptData:pushData key:self.SESSION_KEY];
    NSMutableData * allData = [self getAllData:outData command:EmCmdIdEciRespInit seq:2];
    NSMutableDictionary *dic=[[NSMutableDictionary alloc]init];
    [dic setObject:[NSNumber numberWithInt:headCommand] forKey:@"cmd"];
    [dic setObject:@"" forKey:@"recvData"];
    [dic setObject:[allData base64EncodedStringWithOptions:0] forKey:@"respData"];

    CDVPluginResult *pluginResult = nil;
    pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsDictionary:dic];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:callbackId];



}
- (void)sendData:(CDVInvokedUrlCommand*)command
{
    RecvDataPushBuilder *pushBuilder=[RecvDataPush builder];
    [pushBuilder setBasePush:[[BasePush builder] build]];
    NSString *pushDataStr=[command argumentAtIndex:0];
    NSString *sessionKey=[command argumentAtIndex:1];
    [pushBuilder setDatan:[pushDataStr dataUsingEncoding:NSUTF8StringEncoding]];
    [pushBuilder setType:EmDeviceDataTypeEddtManufatureSvr];
    RecvDataPush *pushObj=[pushBuilder build];
    NSData *pushData=pushObj.data;
    NSData *outData =[AESEnrypt encryptData:pushData key:self.SESSION_KEY];
    NSMutableData * allData = [self getAllData:outData command:EmCmdIdEciPushRecvData seq:0];

    CDVPluginResult *pluginResult = nil;
    pluginResult=[CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsArrayBuffer:allData];

    [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];


    NSLog(@"====data==%@",[self hexStringFromData:pushData ]);


}
-(NSString *) cleanNonHexCharsFromHexString:(NSString *)input
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
- (NSData *) dataFromHexString:(NSString*)hexString
{
    NSString * cleanString = [self cleanNonHexCharsFromHexString:hexString];
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
- (NSString *)hexStringFromData:(NSData *)data {
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

-(NSData *)getFixHeadBuf:(int)len command:(int) command seq:(int)seq{
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
-(int)getCmdId:(NSData *)paramData{
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
-(int)getCmdIdBytes:(Byte *)arrayByte{
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
