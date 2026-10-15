package com.xiangxiang.innerclass2;

public class Outer {
    public static String schoolName = "xx";
    private int age;
    // 属于外部类本身
    public static class Inner{
        private String name;
        public void show(){
            System.out.println(Outer.schoolName);
            //System.out.println(age);//编译错误
            //属于外部类对象
        }
        public Inner(String name){
            this.name = name;
        }
        public Inner(){

        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
