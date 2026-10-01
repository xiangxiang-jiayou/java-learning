package com.itxiangxiang.duotai2;

public class Test {
    public static void main(String[] args) {
        //多态的好处
        Animal a = new Toetoise();
        a.run();
        Wolf w = new Wolf();
        go(w);
    }
    public  static void go(Wolf w){
        System.out.println("开始。。。。");
        w.run();
    }

}





//多态不能掉独有的行为
