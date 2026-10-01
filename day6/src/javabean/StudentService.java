package javabean;

public class StudentService {
    //拿到学生对象
    private Student s;
    public StudentService(Student s) {
        this.s = s;
    }
    //打印学生对象的总成绩
    public void printTotalScore() {
        System.out.println("学生总成绩为：" + (s.getChinese()+s.getMath()));
    }
    //打印学生对象的平均成绩
    public void printAverageScore() {
        System.out.println("学生平均成绩为：" + (s.getChinese()+s.getMath())/2);
    }

}
