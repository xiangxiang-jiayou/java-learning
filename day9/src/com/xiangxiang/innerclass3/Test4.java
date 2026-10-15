package com.xiangxiang.innerclass3;

import java.util.Arrays;
import java.util.Comparator;

public class Test4 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("张三", 18, 1.88, "男");
        students[1] = new Student("李四", 19, 1.78, "女");
        students[2] = new Student("王五", 20, 1.69, "男");
        students[3] = new Student("赵六", 21, 1.58, "女");
        students[4] = new Student("钱七", 22, 1.77, "男");
        students[5] = new Student("孙八", 23, 1.56, "女");


        //按照身高排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //指定排序规则
                return o1.getAge()-o2.getAge();//升序
            }
        });

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}