package singleinstance;
//设计成单例类
public class A {
    private A(){//私有化构造方法
    }
    private   static A a = new A();//创建一个本类对象
    public static A getInstance(){
        return a;
    }

}
