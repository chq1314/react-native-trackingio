//
//  RCTTalkingData.m
//  RCTTalkingData
//
//  Created by LvBingru on 1/11/16.
//  Copyright © 2016 erica. All rights reserved.
//

#import "RCTTrackingIO.h"
#import "RCTUtils.h"
#import "Tracking.h"

@implementation RCTTrackingIO

RCT_EXPORT_MODULE(TrackingIOAPI)

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

+ (void)registerApp:(NSString *)appId channelID:(NSString *)channelID
{
    static dispatch_once_t onceToken;
    dispatch_once(&onceToken, ^{
        [Tracking initWithAppKey:appId withChannelId:channelID];
    });
    
#ifdef DEBUG
    [TalkingData setLogEnabled:YES];
#endif
}

RCT_EXPORT_METHOD(setRegisterWithAccountID:(NSString *)account)
{
    [Tracking setRegisterWithAccountID:account];
}

RCT_EXPORT_METHOD(setLoginWithAccountID:(NSString *)account)
{
    [Tracking setLoginWithAccountID:account];
}

RCT_EXPORT_METHOD(setOrder:(NSString *)transactionId currentType:(NSString *)currencyType currencyAmount:(float)currencyAmount)
{
    [Tracking setOrder:transactionId currentType:currencyType currencyAmount:currencyAmount];}

RCT_EXPORT_METHOD(setPayment:(NSString *)transactionId paymentType:(NSString*)paymentType currentType:(NSString *)currencyType currencyAmount:(float)currencyAmount)
{
   [Tracking setRyzf:transactionId ryzfType:paymentType currentType:currencyType currencyAmount:currencyAmount];
}

RCT_EXPORT_METHOD(setEvent:(NSString *)eventName)
{
    [Tracking setEvent:eventName];
}


@end
