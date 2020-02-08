package com.singleton.test;

import com.singleton.innerclasssingleton.InnerClassSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname Test
 * @Description TODO
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取类的构造方法
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        //设置构造方法访问权限
        declaredConstructor.setAccessible(true);
        //实例化对象
        InnerClassSingleton instance = declaredConstructor.newInstance();

        //通过单例实例化对象
        InnerClassSingleton instance1 = InnerClassSingleton.getInstance();
        //比较两个对象。输出结果为false，即实例化了多个对象。
        System.out.println(instance == instance1);
    }
}
