package com.designpattern.model;

/**
 * @Classname Dog
 * @Description 具体产品
 */
public class Dog implements Animal {
    public void voice() {
        System.out.println("狗狗：汪汪汪...");
    }
    public void eat() {
        System.out.println("狗狗：吃肉骨头");
    }
}
