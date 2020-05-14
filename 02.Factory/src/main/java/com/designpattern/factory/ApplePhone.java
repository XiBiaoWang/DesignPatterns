package com.designpattern.factory;

/**
 * @Classname ApplePhone
 * @Description  具体产品    继承抽象产品
 */
public class ApplePhone implements  TelePhone {
    public void call() {
        System.out.println("苹果手机打电话");
    }

    public void sendSms() {
        System.out.println("苹果手机发短信");
    }
}
