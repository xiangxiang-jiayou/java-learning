package com.itxiangxiang.duotai3;

public class Test {
    public static void main(String[] args) {
        //多态
        //父类引用指向子类对象
        Animal a1 = new Toetoise();
        a1.run();//编译看左边，运行看右边
        Toetoise t = (Toetoise) a1;
        t.shrinkHead();
        if (a1 instanceof Toetoise) {//判断a1是否是Toetoise类型
            Toetoise t1 = (Toetoise) a1;
            t1.shrinkHead();
        }
    }
        public static void go(Animal t){
            System.out.println("开始。。。。");
            t.run();
            //a.shrinkHead();//error

    }

}
