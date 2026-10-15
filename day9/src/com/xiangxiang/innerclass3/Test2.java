package com.xiangxiang.innerclass3;

public class Test2 {
    public static void main(String[] args) {
        Swim s1 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("学生游泳");
            }
        };
        start(s1);

        System.out.println("------------");
//        Swim s2 = new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("老师游泳");
//            }
//        };
//        start(s2);
        start(new Swim() {
            @Override
            public void swimming(){
                System.out.println("老师游泳");
        }
    });
    }
    public static void start(Swim s){
        System.out.println("开始");
        s.swimming();
        System.out.println("结束");
    }

}
//class Student implements Swim{
//    @Override
//    public void swimming() {
//        System.out.println("学生游泳");
//    }
//}
//class Teacher implements Swim{
//    @Override
//    public void swimming() {
//        System.out.println("老师游泳");
//    }

interface Swim{
    void swimming();
}