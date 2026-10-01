package com.itxiangxiang.demo;

public class GoldCard extends Card {

    public  GoldCard(String cardId, String name, String phone, double money) {
        super(cardId, name, phone, money);
    }
    @Override
    public void consume(double money) {
        System.out.println("消费金额：" + money);
        System.out.println("优惠后的价格"+money*0.8);
        if(getMoney()<money*0.8){
            System.out.println("余额不足，无法消费");
            return;
        }
        //更新余额
        setMoney(getMoney()-money*0.8);
        //判断消费是否大于200，打印洗车票
        if(money*0.8>=200){
            printTicket();
        }else{
            System.out.println("消费金额不足200，不打印洗车票");
        }

    }
    public void printTicket(){
        System.out.println("打印洗车票");
    }
}
