package com.designpattern.model;

/**
 * @Classname Cat
 * @Description TODO
 * @Date 2020/2/10 15:09
 * @Created by 86135
 */
public class Cat implements Animal {
    public void voice() {
        System.out.println("喵喵喵...");
    }

    public void eat() {
        System.out.println("吃鱼");
    }
}
