package Abstract1;

public abstract class A {
    //抽象方法 没有方法体，只有方法声明
    //抽象类可以没有抽象方法
    //抽象方法必须是抽象类

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //核心特点
//    抽象类不能创建对象
    private String name;
    private int age;

    public A(){
        System.out.println("A的无参数构造器");
    }
    public A(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract void run();
}
