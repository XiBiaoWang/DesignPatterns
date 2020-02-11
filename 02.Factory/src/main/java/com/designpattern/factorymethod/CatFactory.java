package com.designpattern.factorymethod;

import com.designpattern.model.Animal;
import com.designpattern.model.Cat;

/**
 * @Classname CatFactory
 * @Description 具体工厂
 */
public class CatFactory extends AbstractFactory {
    @Override
    public Animal creatProduct() {
        return new Cat();
    }
}
