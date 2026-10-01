package interface3;

public class ClassDataInter2 implements ClassDataInter {
    private Student[] students;

    public ClassDataInter2(Student[] students) {
        this.students = students;
    }

    @Override
    public void printAllStudentInfos() {
        //加上男女人数的统计
        int maleCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if (s.getSex() == '男') {
                maleCount++;
            }


        }
        System.out.println("男生人数：" + maleCount);
        System.out.println("女生人数：" + (students.length - maleCount));

    }

    @Override
    public void printAverageScore() {
        System.out.print("平均分：");
        //去掉最高最低
        double sum = students[1].getScore();
        double max = students[1].getScore();
        double min = students[1].getScore();
        for (int i = 1; i < students.length; i++) {
            if(students[i].getScore()>max){
                max=students[i].getScore();
            }
            if(students[i].getScore()<min) {
                min = students[i].getScore();
            }
            sum+=students[i].getScore();



        }
        System.out.println((sum-max-min)/(students.length-2));
    }


}

