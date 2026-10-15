package com.xiangxiang.method1refrence;


import java.util.Arrays;
import java.util.Comparator;


public class Demo3 {
    public static void main(String[] args) {
        String[] names = {"Tom","Jerry","Jack","Rose","Lucy","Mary","Bob","alice"};
        //使用lambda表达式对数组进行排序,忽略首字母大小写
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        System.out.println(Arrays.toString(names));
   //     Arrays.sort(names,( o1,o2)->o1.compareToIgnoreCase(o2));
        Arrays.sort(names,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));




    }
}
