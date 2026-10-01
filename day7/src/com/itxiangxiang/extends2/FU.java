package com.itxiangxiang.extends2;

public class FU {
    private void privateMethod() {
        System.out.println("privateMethod");
    }
    void Method() {
        System.out.println("Method");
    }
    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }
    public void publicMethod() {
        System.out.println("publicMethod");
    }



    public static void main(String[] args) {
        FU fu = new FU();
        fu.publicMethod();
    }
}
