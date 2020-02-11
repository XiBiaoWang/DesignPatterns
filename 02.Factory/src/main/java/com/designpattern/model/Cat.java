package com.designpattern.model;

/**
 * @Classname Cat
 * @Description 具体产品
 */
public class Cat implements Animal {
    public void voice() {
        System.out.println("喵喵喵...");
    }

    public void eat() {
        System.out.println("吃鱼");
    }
}
