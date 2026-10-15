package com.xiangxiang.innerclass3;

public class Test {
    public static void main(String[] args) {
        //了解匿名内部类
        //实际名字外部类+$+数字
        //本质是一个子类，并且立即构造一个对象
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("喵喵喵");
            }
        };
        a.cry();
    }
}
//class Cat extends Animal{
//    @Override
//    public void cry() {
//        System.out.println("喵喵喵");
//    }
//}
