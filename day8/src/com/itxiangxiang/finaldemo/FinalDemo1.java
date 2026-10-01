package com.itxiangxiang.finaldemo;

public class FinalDemo1 {
    //final 修饰静态变量，今后不能被修改，通常作为一个系统的配置信息
    //通常为大写字母
    public static final String NAME="张三";
    public static void main(String[] args) {
      //final作用
        /*
        * 变量有那些？
        * a.局部变量
        * b.成员变量
        * 实例变量   //通常不用final修饰
        * 静态变量
        *
        *
        * */
        final int a=10;//不能被重新赋值
        //a=20;
        //final修饰引用类型的变量，地址不能改，但是指向的内容可以改变
        final int[] arr={1,2,3};
        arr[0]=100;

      final double PI=3.14;//不能被重新赋值
    }
    public static void buy(final double z) {//z不能被重新赋值
        System.out.println(z);
    }

}
//修饰类
//工具类一般用final修饰


final class A{}

class  C{
    public final void show(){
        System.out.println("show");
    }

}
class D extends C{
   // public void show(){    error 不能被重写
     //   System.out.println("show");
    //}
}

//class B extends A{}//final修饰的类不能被继承
//final修饰引用类型的变量，地址不能改，但是指向的内容可以改变
