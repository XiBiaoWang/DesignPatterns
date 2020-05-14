package com.designpattern.factory;

/**
 * @Classname XiaomiPhone
 * @Description   具体产品   继承抽象产品
 */
public class XiaomiPhone implements TelePhone {
    public void call() {
        System.out.println("小米手机打电话");
    }

    public void sendSms() {
        System.out.println("小米手机发短信");
    }
}
