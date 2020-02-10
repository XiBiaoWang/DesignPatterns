package com.designpattern.model;

/**
 * @Classname Dog
 * @Description TODO
 * @Date 2020/2/10 15:07
 * @Created by 86135
 */
public class Dog implements Animal {
    public void voice() {
        System.out.println("狗狗：汪汪汪...");
    }

    public void eat() {
        System.out.println("狗狗：吃肉骨头");
    }
}
