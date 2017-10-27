

#import <Cordova/CDV.h>
#import <Foundation/Foundation.h>

#define HEAD_LEN      8
#define SEND_DATA_HEAD_LEN      12

@interface WeHardPlugin : CDVPlugin

@property(nonatomic,strong)NSData *SESSION_KEY;

- (void)receiveData:(CDVInvokedUrlCommand*)command;
- (void)sendData:(CDVInvokedUrlCommand*)command;

@end
