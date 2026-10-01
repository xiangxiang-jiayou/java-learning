package com.itxiangxiang.demo;

public class SilverCard extends Card {
    public  SilverCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("消费金额：" + money);
        System.out.println("优惠后的价格" + money * 0.9);
        if (getMoney() < money * 0.9) {
            System.out.println("余额不足，无法消费");
        }
        //更新余额
        setMoney(getMoney() - money * 0.9);
    }
}