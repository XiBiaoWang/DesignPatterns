package com.designpattern.factory;

/**
 * @Classname AppleFactory
 * @Description
 */
public class AppleFactory implements Factory {
    public TelePhone createPhone() {
        return new ApplePhone();
    }

    public Pad createPad() {
        return new ApplePad();
    }
}
