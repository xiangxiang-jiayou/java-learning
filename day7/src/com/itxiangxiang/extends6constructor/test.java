package com.itxiangxiang.extends6constructor;

public class test {
    public static void main(String[] args) {
        //先父后子
        Zi zi = new Zi();
    }
}
class Zi extends Fu {
    public Zi() {
        //super();默认存在
        super("张三");
        System.out.println("子类无参构造方法");
    }
}



class   Fu{
    public Fu(){
        System.out.println("父类无参构造方法");
    }
    public Fu(String name){
        System.out.println("父类有参构造方法");
    }
}