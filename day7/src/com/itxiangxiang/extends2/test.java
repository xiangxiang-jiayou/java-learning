package com.itxiangxiang.extends2;

public class test {
    public static void main(String[] args) {
        //目标：认识四种权限修饰符的修饰范围。
         FU fu = new FU();
         fu.Method();
         fu.publicMethod();
         fu.protectedMethod();
         //fu.privateMethod();//error
    }
}
