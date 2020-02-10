package com.designpattern.factory;

import com.designpattern.model.Animal;
import com.designpattern.model.Cat;
import com.designpattern.model.Dog;

/**
 * @Classname Factory
 * @Description TODO
 */
public class Factory {

    public static Animal getAnimal(String name){
        if("dog".equals(name)){
            return new Dog();
        }else if("cat".equals(name)){
            return new Cat();
        }else{
            return null;
        }
    }
}
