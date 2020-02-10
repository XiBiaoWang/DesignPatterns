# 单例模式 Singleton  

## 1.懒汉模式：延迟加载，只有在使用时才开始实例化

- 线程安全问题：多线程情况下，创建多个实例
- double check 加锁优化
- 编译器（JIT），CPU有可能对指令进行重排序，导致使用尚未初始化的实例，可以通过添加volatile关键字修饰，对于volatile修饰的字段，可以防止指令重排。

```
public class LazySingleton {
    private volatile static LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized(LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
```

## 2.饿汉模式：类加载的初始化阶段完成实例的初始化。本质上利用jvm的类加载机制，保证实例的唯一性。

类加载过程：

- 1，加载二进制数据到内存中，生成对应的Class数据结构

- 2，连接：a 验证、b 准备（给类的静态成员变量赋默认值）、c 解析

- 3，初始化：给类的静态变量赋初值

  只有在真正使用对应的类时，才会触发初始化（当前类时启动类即main函数所在类，直接进行new操作，访问静态属性、访问静态方法，用反射访问类，初始化一个类的子类等。） 

```
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return instance;
    }

    public static void main(String[] args){
        HungrySingleton singleton = HungrySingleton.getInstance();
    }
}
```

## 3.静态内部类：

- 利用jvm类的加载机制保证线程安全。
- 使用时才初始化。属于懒加载。

```
public class InnerClassSingleton {
    private static class InnerClassHolder{
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }
    private InnerClassSingleton(){}

    public static InnerClassSingleton getInstance(){
        return InnerClassHolder.instance;
    }

    public static void main(String[] args) {
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
    }
}
```

## 4.反射攻击：利用反射实例化对象对单例模式的影响

```
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

解决方法：
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
...
```





## 源码中的应用

```
//jdk
java.lang.Runtime
//spring
org.springframework.aop.framework.ProxyFactoryBean

org.springframework.beans.factory.support.DefaultStringBeanRegistry

org.springframework.core.ReactiveAdapterRegistry
//tomcat
org.apache,catalina.webresources.TomcatURLStreamHadlerFactory
//反序列化指定数据源
java.util.Currency

```

