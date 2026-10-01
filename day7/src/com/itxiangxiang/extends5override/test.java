package com.itxiangxiang.extends5override;

public class test {
    public static void main(String[] args) {
        //认识方法重写
        Cat cat = new Cat();
        cat.cry();

    }
}
class Cat extends Animal{
    //方法重写
   @Override
   //方法重写的校验注解  子类范围要大于父类
   //子类类型要小于等于父类
   //私有，静态方法不能重写
   public void cry(){
        System.out.println("喵喵喵");
    }

}
class Animal{
    public  void cry(){
        System.out.println("动物发出叫声");
    }
}
