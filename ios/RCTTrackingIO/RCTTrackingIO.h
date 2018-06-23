//
//  RCTTalkingData.h
//  RCTTalkingData
//
//  Created by LvBingru on 1/11/16.
//  Copyright © 2016 erica. All rights reserved.
//

#import <React/RCTBridgeModule.h>

@interface RCTTrackingIO : NSObject <RCTBridgeModule>

+ (void)registerApp:(NSString *)appId channelID:(NSString *)channelID;

@end
