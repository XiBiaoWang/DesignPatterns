package com.singleton.innerclasssingleton;

/**
 * @Classname InnerClassSingleton
 * @Description TODO
 * @Date 2020/2/6 23:44
 * @Created by 86135
 */
public class InnerClassSingleton {
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){
        //如果对象已经实例化，抛出异常。
        if(InnerClassHolder.instance != null){
            throw new RuntimeException("单例模式下不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

    public static void main(String[] args) {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
    }
}
