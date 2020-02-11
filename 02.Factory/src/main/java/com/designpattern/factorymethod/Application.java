package com.designpattern.factorymethod;

import com.designpattern.model.Animal;

/**
 * @Classname Application
 * @Description TODO
 */
public class Application {
    public static void main(String[] args) {
        AbstractFactory factory = new CatFactory();
        Animal cat = factory.creatProduct();
        cat.voice();
        cat.eat();
    }
}
