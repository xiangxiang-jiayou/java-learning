package interface4;

public interface A {
    //1.默认方法  必须加defualt修饰，默认public修饰
    //如何调用
    default void go(){
        System.out.println("A go");
    }

    //私有方法
    //只能使用接口中其他实例方法调用
    private void run(){
        System.out.println("A run");
    }

    //静态方法
    //只能使用当前接口名调用
    static void eat(){
        System.out.println("A eat");
    }
}
