package com.itxiangxiang.extends5override;

public class test2 {
    public static void main(String[] args) {
        //子类重写Object类中的toString方法
        Student s = new Student("张三",18,'男');
        System.out.println(s);//com.itxiangxiang.extends5override.Student@1b6d3586 地址
        System.out.println(s.toString());//com.itxiangxiang.extends5override.Student@1b6d3586 地址
        //重写后
        //注意1.toString方法在Object类中已经存在 ，默认输出地址，可以省略不写
        //注意2.输出对象的地址是没有意义的，开放中更希望输出对象的内容，所以子类需要重写Object类中的toString方法

    }
}
class Student{

    private String name;
    private int age;
    private char sex;

    public Student(){
    }
    public Student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override//就近访问
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


}