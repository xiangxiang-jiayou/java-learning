package com.itheima;



public class test {
    //学生类
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "张三";
        s1.age = 18;
        s1.sex = "男";

        System.out.println(s1.name + " " + s1.age + " " + s1.sex );
        Student s2 = new Student("lisa", 20, "女");
        System.out.println(s2.name + " " + s2.age + " " + s2.sex );
    }
}


