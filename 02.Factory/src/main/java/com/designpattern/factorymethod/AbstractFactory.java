package com.designpattern.factorymethod;

import com.designpattern.model.Animal;

/**
 * @Classname AbstractFactory
 * @Description 抽象工厂类
 */
abstract class AbstractFactory {
    public abstract Animal creatProduct();
}
