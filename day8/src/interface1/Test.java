package interface1;

public class Test {
    public static void main(String[] args) {
        //认识接口
        System.out.println(A.NAME);

       // A a = new A();//ERROR
        //接口不能创建对象
        C c = new C();
        c.show();
    }
}
class C implements A , B{
    @Override
    public void show() {
        System.out.println("show");

    }

    @Override
    public void show2() {

    }

    @Override
    public void play() {

    }


}