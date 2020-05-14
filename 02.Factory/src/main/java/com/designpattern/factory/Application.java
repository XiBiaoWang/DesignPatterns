package com.designpattern.factory;

/**
 * @Classname Application
 * @Description    client
 */
public class Application {
    public static void main(String[] args) {
        //实例化小米工厂
        xiaomiProduct();
        //实例化苹果工厂
        appleProduct();
    }

    private static void appleProduct() {
        AppleFactory appleFactory = new AppleFactory();
        TelePhone iphone = appleFactory.createPhone();
        iphone.call();
        iphone.sendSms();

        Pad ipad = appleFactory.createPad();
        ipad.play();
        ipad.video();
    }

    private static void xiaomiProduct() {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        TelePhone xiaomi10 = xiaomiFactory.createPhone();
        xiaomi10.call();
        xiaomi10.sendSms();

        Pad xiaomiPad4 = xiaomiFactory.createPad();
        xiaomiPad4.play();
        xiaomiPad4.video();
    }
}
