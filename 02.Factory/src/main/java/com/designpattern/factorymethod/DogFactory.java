package com.designpattern.factorymethod;

import com.designpattern.model.Animal;
import com.designpattern.model.Dog;

/**
 * @Classname DogFactory
 * @Description 具体工厂
 */
public class DogFactory extends AbstractFactory {
    @Override
    public Animal creatProduct() {
        return new Dog();
    }
}
