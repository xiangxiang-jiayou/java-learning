package interface3;

public class ClassDataInter1 implements ClassDataInter{
    private Student[] students;

    public ClassDataInter1(Student[] students){
        this.students=students;
    }

    @Override
    public void printAverageScore() {
        double sum=0;
        for (int i = 0; i < students.length; i++) {
            sum+=students[i].getScore();
        }
        System.out.println("平均成绩为："+sum/students.length);
    }
    @Override
    public void printAllStudentInfos() {
        System.out.println("学生信息如下：");
        for (int i = 0; i < students.length; i++) {
           Student s = students[i];
           System.out.println(s.getName()+" "+s.getSex()+" " +s.getScore());
        }
    }


}
