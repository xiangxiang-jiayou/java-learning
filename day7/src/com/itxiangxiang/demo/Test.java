package com.itxiangxiang.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //加油站支付小程序
        GoldCard gc = new GoldCard("京A88888", "张三", "123456789", 5000);
        SilverCard sc = new SilverCard("京B88888", "李四", "122222222", 2000);
        pay(gc);
    }
    //支付机
    public static void pay(Card c){
        System.out.println("请刷卡：请您输入当前消费金额");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.consume(money);
    }


}
