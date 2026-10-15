package com.xiangxiang.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        System.out.println(list);

        System.out.println(list.get(1));

        //删除数据
        String e = list.remove(1);
        System.out.println(e);
        System.out.println(list);
        list.remove("java");
        System.out.println(list);

    }
}