package staticmethod;

public class test {
    public static void main(String[] args) {

        Student.printHelloWorld();
        //Student s = new Student();
        //s.printHelloWorld();//不推荐
        //实例方法

        Student s = new Student();
        s.setScore(80);
        s.printPass();
        //如果方法只是为了做一个功能，不用访问对象时，用静态定义
        //如果需要访问对象的行为，必须定义为实例方法

    }
}
