package com.designpattern.factory;

/**
 * @Classname ApplePad
 * @Description
 */
public class ApplePad implements Pad {
    public void play() {
        System.out.println("苹果平板玩游戏");
    }

    public void video() {
        System.out.println("苹果平板看电影");
    }
}
