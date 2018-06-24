# react-native-trackingio
React Native的TrackingIO插件
## 如何安装

### 首先安装插件

```bash
yarn add react-native-trackingio --save
```

### link
react-native link

### iOS工程配置

在工程target的`Build Phases->Link Binary with Libraries`中加入 `libsqlite3.tbd`


在你工程的`AppDelegate.m`文件中添加如下代码：

```
#import "RCTTalkingData.h"


- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
  [RCTTrackingIO registerApp:@"APPID" channelID:@"CHANNELID"];
  ...
  ...
}

```

### 安装Android工程

在你自定义的MainApplication的onCreate()中第一行加入

```
	TrackingIOModule.register(getApplicationContext(), "APPID", "CHANNELID");
```


## 如何使用

### 引入包

import { NativeModules } from 'react-native';
const trackingIO = NativeModules.TrackingIO;

if (trackingIO !== undefined && trackingIO !== null) {
	trackingIO.setRegisterWithAccountID("accountId");
}

### API

#### trackingIO.setRegisterWithAccountID(accountId)
#### trackingIO.setLoginSuccessBusiness(accountId)
#### trackingIO.setPayment(transactionId, paymentType, currencyType, currencyAmount)
#### trackingIO.setEvent(eventName)
#### trackingIO.setOrder(transactionId, currencyType, currencyAmount)
