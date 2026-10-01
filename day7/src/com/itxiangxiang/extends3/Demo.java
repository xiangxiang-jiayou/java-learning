package com.itxiangxiang.extends3;

import com.itxiangxiang.extends2.FU;

public class Demo {
    public static void main(String[] args) {
        FU fu = new FU();
        fu.publicMethod();
        //fu.protectedMethod();//error
        //fu.Method();//error
        //fu.privateMethod();//error

    }
}
