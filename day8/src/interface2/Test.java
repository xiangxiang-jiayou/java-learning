package interface2;

public class Test {
    public static void main(String[] args) {
        //理解Java接口的好处
        //1.接口可以多继承，弥补了单继承的不足
        People p = new Student();
        Driver d = new Student();
        BoyFriend b = new Student();

        //可以面向接口编程,便于解耦合
        Driver d1 = new Student();

    }
}
interface  Driver{}
interface  BoyFriend{}
class People{}
class Student extends People implements Driver, BoyFriend{}

class Teacher implements Driver, BoyFriend{}
