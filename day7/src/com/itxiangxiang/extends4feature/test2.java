package com.itxiangxiang.extends4feature;

public class test2 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();

    }
}
class Fu{
    String name = "父类";
}
class Zi extends Fu{
    String name = "子类";
    public void show(){
        String name = "局部变量";
        System.out.println(name);
        System.out.println(this.name);//对象的name
        System.out.println(super.name);//父类的name

    }
}