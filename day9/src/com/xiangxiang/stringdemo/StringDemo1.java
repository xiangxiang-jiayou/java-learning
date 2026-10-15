package com.xiangxiang.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        //目的，掌握创建字符串对象，封装要处理的字符串数据
        String s1 = "hello";

        System.out.println(s1);
        System.out.println(s1.length());

        //方式2
        String s2 = new String();
        System.out.println(s2);//""

        String s3 = new String("hello");
        System.out.println(s3);//hello

        char[] chs = {'h','e','l','l','o'};
        String s4 = new String(chs);
        System.out.println(s4);//hello

        byte[] bytes = {97,98,99,100,101};
        String s5 = new String(bytes);
        System.out.println(s5);//abcde

        //区别
        //""写出的字符串对象会储存在常量池中   节约内存
        //new String()创建的字符串对象会储存在堆内存中

        String s6 = "hello";
        String s7 = "hello";
        System.out.println(s6 == s7);//true

        String s8 = new String("hello");
        String s9 = new String("hello");
        System.out.println(s8 == s9);//false
        //s8和s9是两个不同的对象，储存在堆内存中，所以地址值不同

        //封装字符串
        String s10 = "hello";
        String s11 = "world";
        String s12 = s10 + s11;
        System.out.println(s12);//helloworld
        System.out.println(s12.length());//10
        System.out.println(s12.charAt(0));//h
        //equals
        System.out.println(s12.equals("helloworld"));//true
        System.out.println(s12.equals("Helloworld"));//false
        //==和equals的区别
        //==比较的是地址值
        //equals比较的是内容
        System.out.println(s12 == "helloworld");//false
        System.out.println(s12.equals("helloworld"));//true

        //12345678909==>123****8909
        System.out.println("请输入手机号：");
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();
        System.out.println(phone.substring(0,3) + "****" + phone.substring(7));//7-10
    }
}
