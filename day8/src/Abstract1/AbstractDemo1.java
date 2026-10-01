package Abstract1;

public class AbstractDemo1 {
    public static void main(String[] args) {
//        A a = new A();//ERROR
        //抽象类不能创建对象
        //抽象类为了让子类继承
        B b = new B();
        b.run();
        b.setName("小狗");
        System.out.println(b.getName());
        b.setAge(10);
        System.out.println(b.getAge());

    }
}
