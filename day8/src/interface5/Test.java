package interface5;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.show();

    }
}

interface A{
    void show1();
}
interface B{
    void show2();
}
interface C extends A,B{//接口继承接口
    void show3();
}
class D implements C {//类实现接口
    @Override
    public void show1() {
        System.out.println("show1");
    }
    @Override
    public void show2() {
        System.out.println("show2");
    }
    @Override
    public void show3() {
        System.out.println("show3");
    }
}

/*interface  A1{
    void show();
}
interface B1{
    String show();
}                                    //方法前面冲突时不支持多实现，多继承
interface C1 extends A1,B1{}//error
    */

interface  A2{
    default void show(){
        System.out.println("A2");
    };
}

class Animal{
    public void show(){
        System.out.println("Animal");
    }
}
class Dog extends Animal implements A2{
 //优先用父类中的show方法
}