package capsulation;

public class Student {
    String name;
    //如何隐藏：private其他地方不能访问
    private int age;
    private double chinese;
    private double math;

    //如何暴露 使用public修饰的get和set方法
    public void setAge(int age) {
        if(age > 0 && age< 150) {
            this.age = age;
        }else {
            System.out.println("输入的年龄不合法");
        }
    }
/**
 * 获取年龄的方法
 * @return 返回年龄值
 */
    public int getAge() {
        return age; // 返回age成员变量的值
    }

    public void printAllScore() {
        System.out.println(name + "的总成绩是" + (chinese + math));
    }
    public void printAverageScore() {
        System.out.println(name + "的平均成绩是" + (chinese + math) / 2);
    }
}