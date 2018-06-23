/**
 * Created by chq1314 on 22/06/18.
 */
import { NativeModules } from 'react-native';

const nativeModule = NativeModules.TrackingIO;

export function setRegisterWithAccountID(accountId) {
  nativeModule.setRegisterWithAccountID(accountId);
}

export function setLoginSuccessBusiness(accountId) {
  nativeModule.setLoginSuccessBusiness(accountId);
}

export function setPayment(transactionId, paymentType, currencyType, currencyAmount) {
  nativeModule.setPayment(transactionId, paymentType, currencyType, currencyAmount);
}

export function setEvent(eventName) {
  nativeModule.setEvent(eventName);
}

export function setOrder(transactionId, currencyType, currencyAmount) {
  nativeModule.setOrder(transactionId, currencyType, currencyAmount);
}