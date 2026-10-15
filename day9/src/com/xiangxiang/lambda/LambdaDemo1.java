package com.xiangxiang.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("小狗汪汪叫");
            }
        };
        a.cry();

//        Animal a1 = () ->{
//                System.out.println("小狗汪汪叫");
//            }
//        };
//        a1.cry();//error
        System.out.println("=============================");

        Swim s = () -> {
            System.out.println("狗在游泳");
        };
        s.swimming();
   }
}

abstract class Animal{
    public abstract void cry();
}

@FunctionalInterface  //函数式接口只有一个方法
interface Swim{
    void swimming();
}