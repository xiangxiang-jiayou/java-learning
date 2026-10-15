package com.xiangxiang.code;

import java.util.Arrays;

public class CodeDemo1 {
    public static String schoolName;
    public static String[] cards = new String[54];
    static{
        System.out.println("===静态代码执行了===");
        schoolName  = "sxz";
        cards[0] = "A";
        cards[1] = "1";
        cards[2] = "2";




    }

    public static void main(String[] args) {
        System.out.println("===main方法执行了===");
        System.out.println(schoolName);
        System.out.println(Arrays.toString(cards));
    }
}
