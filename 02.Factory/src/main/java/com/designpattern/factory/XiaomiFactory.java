package com.designpattern.factory;

/**
 * @Classname XiaomiFactory
 * @Description  具体工厂   实现生产具体产品方法
 */
public class XiaomiFactory implements Factory {
    public TelePhone createPhone() {
        return new XiaomiPhone();
    }

    public Pad createPad() {
        return new XiaomiPad();
    }
}
