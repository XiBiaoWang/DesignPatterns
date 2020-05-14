package com.designpattern.factory;


/**
 * @Classname Factory
 * @Description 抽象工厂   接口定义 生产产品方法
 */
public interface Factory {
    TelePhone createPhone();

    Pad createPad();
}
