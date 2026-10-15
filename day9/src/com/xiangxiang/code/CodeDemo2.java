package com.xiangxiang.code;

public class CodeDemo2 {
    private String name;
    private String[] direction = new String[4];
    {
        System.out.println("===构造代码块执行了===");
        name = "张三";
        direction[0] = "上";
        direction[1] = "下";
        direction[2] = "左";
        direction[3] = "右";
    }

    public static void main(String[] args) {
        System.out.println("===main方法执行了===");
        new CodeDemo2();
        new CodeDemo2();
        new CodeDemo2();
    }
}
