package com.itxiangxiang.extendsdemo;

public class test2 {
    public static void main(String[] args) {
        //目标：子类构造器调用父类构造器的应用场景
        Teacher t = new Teacher("张三", '男', "唱歌");
        System.out.println(t.getName() + " " + t.getSex() + " " + t.getSkill());

    }
}