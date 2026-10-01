package staticfiled;

public class test {
    public static void main(String[] args){
        //推荐
        Student.name = "袁华";
        System.out.println(Student.name);
        //不推荐
        Student s1 = new Student();
        s1.name = "张三";

        Student s2 = new Student();
        s2.name = "李四";

        System.out.println(Student.name);//李四
        System.out.println(s1.name);//李四
        //实例变量的访问
        s1.age = 18;
        System.out.println(s1.age);//18
        s2.age = 23;
        System.out.println(s2.age);//23
    }
}
