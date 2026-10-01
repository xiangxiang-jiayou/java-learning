package singleinstance;

public class Test {
    public static void main(String[] args) {
        A a =A.getInstance();
        A b =A.getInstance();
        System.out.println(a==b);//true

        System.out.println("=============");

        B b1 = B.getInstance();
        B b2 = B.getInstance();
        System.out.println(b1==b2);//true

    }
}
