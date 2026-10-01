package com.itxiangxiang.extendsdemo;
//继承目的
//1.代码重用
//2.扩展功能


public class test {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        //输出
        System.out.println(t.getName());
        System.out.println(t.getSex());
        System.out.println(t.getSkill());

    }
}
