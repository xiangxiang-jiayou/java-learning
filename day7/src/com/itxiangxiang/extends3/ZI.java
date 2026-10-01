package com.itxiangxiang.extends3;

import com.itxiangxiang.extends2.FU;

public class  ZI extends FU {

        public void show(){
            //privateMethod();//error
            //method();//error
            protectedMethod();
            publicMethod();

        }

}

