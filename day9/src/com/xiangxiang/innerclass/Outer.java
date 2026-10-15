package com.xiangxiang.innerclass;

public class Outer {
    public static  void test(){
        System.out.println("Outer test");
    }
    public static  String schoolName = "北京大学";
    private int age;
    public void run(){
        System.out.println("Outer run");
    }
    public class Inner {
        private String name;
        public void show() {
            System.out.println("Inner show");
            System.out.println(schoolName);
            test();
            System.out.println(age);
            run();
            System.out.println(Outer.this);
            System.out.println(this);
        }
        public Inner(String name) {
            this.name = name;
        }

        public Inner(){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}