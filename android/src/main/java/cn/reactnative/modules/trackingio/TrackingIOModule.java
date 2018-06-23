package cn.reactnative.modules.trackingio;

import android.content.Context;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

import java.util.HashMap;

/**
 * Created by chq1314 on 22/06/18.
 */
public class TrackingIOModule extends ReactContextBaseJavaModule {

    public TrackingIOModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "TrackingIOAPI";
    }

    private static Boolean registered = false;

    public static void register(Context context, String appID, String channelID, boolean reportExceptions) {
        if (!registered) {
                
            Tracking.initWithKeyAndChannelId(context, appID, channelID);

            registered = true;
        }
    }
    
    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
    }

    @ReactMethod
    public void setRegisterWithAccountID(String accountId){
        Tracking.setRegisterWithAccountID(accountId);
    }

    @ReactMethod
    public void setLoginSuccessBusiness(String accountId){
        Tracking.setLoginSuccessBusiness(String accountId);
    }

    @ReactMethod
    public void setPayment(String transactionId,String paymentType,String  currencyType,float currencyAmount){
        Tracking.setPayment(transactionId, paymentType, currencyType, currencyAmount);
    }

    @ReactMethod
    public void setEvent(final String eventName) {
        Tracking.setEvent(eventName);
    }

    @ReactMethod
    public void setOrder(String transactionId, String currencyType, float currencyAmount) {
        Tracking.setOrder(transactionId, currencyType, currencyAmount);
    }

    @ReactMethod
    public void exitSdk() {
        Tracking.exitSdk();
    }
}

