package com.xiangxiang.method1refrence;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Student {
    //姓名，年龄，身高，性别

    private String name;
    private int age;
    private double height;
    private String sex;

    public static int compareByAge(Student s1, Student s2) { //比较年龄
        return s1.getAge() - s2.getAge();
    }

    public int compareByHeight(Student s1, Student s2) { //比较身高
        return Double.compare(s1.getHeight() , s2.getHeight());
    }
}
