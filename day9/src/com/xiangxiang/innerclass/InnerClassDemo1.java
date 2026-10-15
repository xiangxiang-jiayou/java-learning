package com.xiangxiang.innerclass;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
        oi.setName("张三");
        System.out.println(oi.getName());
        //成员内部类访问外部类成员
        People.Heart heart = new People().new Heart();
        heart.beat();//200 80 100

    }
}

class People{
    private int heartBeat = 100;
    public class Heart{
        int heatBeat = 80;

        public void beat(){
            int heartBeat = 200;
            System.out.println(heartBeat);
            System.out.println(this.heatBeat);
            System.out.println(People.this.heartBeat);
        }
    }
}