package com.itxiangxiang.extendsdemo;

public class test3 {
    public static void main(String[] args) {
        //调用兄弟构造器
        Student s1 = new Student("张三",'男',20,"北京大学");
        System.out.println(s1);

        Student s2 = new Student("李四",'女',18,"清华大学");
        System.out.println(s2);

    }
}
