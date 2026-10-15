package com.xiangxiang.stringdemo;

public class StringTest2 {
    public static void main(String[] args) {
        //目标生成验证码
        createCode(3);
        System.out.println(createCode(6));

    }

    public static String createCode(int length) {
        //用String存所有字符
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code = "";
        //生成随机数
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * str.length());
            //截取字符
            code += str.charAt(index);

        }
        return code;
    }

}
