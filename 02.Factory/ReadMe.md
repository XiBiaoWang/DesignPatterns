# 工厂模式

## 1.简单工厂

- 不属于设计模式

- 使用工厂类创建产品类的实例

- 角色包括：工厂、抽象产品、具体产品

  ```
  //直接调用子类构造方法实例化对象
  Animal dog = new Dog();
  dog.voice();
  dog.eat();
  //使用工厂创建对象
  Animal dog1 = Factory.getAnimal("dog");
  if(null != dog1) {
  	dog1.voice();
  	dog1.eat();
  }
  
  Factoty.java
  public class Factory {
      public static Animal getAnimal(String name){
          if("dog".equals(name)){
              return new Dog();
          }else if("cat".equals(name)){
              return new Cat();
          }else{
              return null;
          }
      }
  }
  ```

- 简单工厂在源码中的应用：

  ```
  Calendar.getInstance()
  java.text.NumberFormat.getInstance()
  java.util.ResourceBundle.getBundle()
  ```

  

## 2.工厂方法模式

- 简单工厂的缺点
  - 产品创建（子类实例化）集中在工厂类，新增产品需要修改工厂类，违反“开发-关闭原则”。
  - 工厂类出现问题，整个系统会受到影响。

- 工厂方法模式：工厂类父类负责定义创建产品的接口，子类负责生产具体产品。
- 工厂方法模式作用：将产品创建延迟到工厂类子类，由子类决定创建哪一个产品。
- 工厂方法模式组成：
  - 抽象工厂：定义接口
  - 具体工厂：实现接口，创建相应的产品
  - 抽象产品：产品类父类，定义产品类公共接口
  - 具体产品：产品类具体实现

- 使用步骤：

  - 抽象工厂类：

    ```
    abstract class AbstractFactory {
        public abstract Animal creatProduct();
    }
    ```

  - 抽象产品：

    ```
    public interface Animal {
        void voice();
        void eat();
    }
    ```

  - 具体产品：

    ```
    public class Cat implements Animal {
        public void voice() {
            System.out.println("喵喵喵...");
        }
        public void eat() {
            System.out.println("吃鱼");
        }
    }
    
    ----
    
    public class Dog implements Animal {
        public void voice() {
            System.out.println("狗狗：汪汪汪...");
        }
        public void eat() {
            System.out.println("狗狗：吃肉骨头");
        }
    }
    ```

  - 具体工厂

    ```
    public class CatFactory extends AbstractFactory {
        @Override
        public Animal creatProduct() {
            return new Cat();
        }
    }
    
    ----
    public class DogFactory extends AbstractFactory {
        @Override
        public Animal creatProduct() {
            return new Dog();
        }
    }
    ```

  - 调用：

    ```
    AbstractFactory factory = new CatFactory();
    Animal cat = factory.creatProduct();
    cat.voice();
    cat.eat();
    ```

- 工厂方法模式优点：
  - 更符合 开-闭原则
  - 更符合单元职责原则
  - 具体产品和创建者解耦

- 工厂方法模式在源码中的应用

  ```
  java.net.UTLSteamHandlerFactory
  javax.xml.bind.JAXBContet.createMarshaller
  ```

  