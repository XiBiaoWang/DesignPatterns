package com.designpattern.factory;

/**
 * @Classname XiaomiPad
 * @Description
 */
public class XiaomiPad implements Pad {
    public void play() {
        System.out.println("小米平板玩游戏");
    }

    public void video() {
        System.out.println("小米平板看电影");
    }
}
