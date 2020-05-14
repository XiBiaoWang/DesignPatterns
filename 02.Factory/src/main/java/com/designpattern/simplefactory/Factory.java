package com.designpattern.simplefactory;

import com.designpattern.model.Animal;
import com.designpattern.model.Cat;
import com.designpattern.model.Dog;

/**
 * @Classname Factory
 * @Description
 */
public class Factory {
    public static Animal getAnimal(String name){
        if("cat".equals(name)){
            return new Cat();
        }else if("dao".equals(name)){
            return new Dog();
        }else{
            return null;
        }
    }
}
