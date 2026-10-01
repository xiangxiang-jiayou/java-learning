package staticmethod;

public class test4 {
    public static int count = 0;
    public static void main(String[] args) {

    }
    private String name;
    public static void helloworld2() {
        System.out.println("hello world");
    }

        public static void helloworld() {
        System.out.println(count);
        helloworld2();
       // System.out.println(name);     error//实例方法属于对象
    }
}
