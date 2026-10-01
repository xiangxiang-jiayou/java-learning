package com.itxiangxiang.duotai1;

public class Test {
    public static void main(String[] args) {
        //多态
        //父类引用指向子类对象
        Animal a1= new Wolf();
        Animal a2= new Toetoise();
        a1.run();//编译看左边，运行看右边
        a2.run();
        System.out.println(a1.name);//编译看左边，运行看也看左边
        System.out.println(a2.name);
    }

public static void go(Animal a){
    System.out.println("开始。。。。");
    a.run();
    //a.shrinkHead();//error
}
}