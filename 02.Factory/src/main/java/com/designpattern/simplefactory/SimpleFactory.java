package com.designpattern.simplefactory;

import com.designpattern.factory.Factory;
import com.designpattern.model.Animal;
import com.designpattern.model.Dog;

/**
 * @Classname SimpleFactory
 * @Description TODO
 */
public class SimpleFactory {
    public static void main(String[] args) {
        //直接调用子类构造方法实例化对象
        Animal dog = new Dog();
        dog.voice();
        dog.eat();
        //使用工厂创建对象
        Animal dog1 = Factory.getAnimal("dog");
        if(null != dog1) {
            dog1.voice();
            dog1.eat();
        }
    }
}
