package interface3;

public class Test {
    public static void main(String[] args) {
        Student[] AllStudents = new Student[10];
        AllStudents[0] = new Student("张三",'男',99.5);
        AllStudents[1] = new Student("李四",'女',88.5);
        AllStudents[2] = new Student("王五",'女',77);
        AllStudents[3] = new Student("赵六",'男',64.5);
        AllStudents[4] = new Student("钱七",'男',59.5);
        AllStudents[5] = new Student("孙八",'女',49.5);
        AllStudents[6] = new Student("周九",'男',76.5);
        AllStudents[7] = new Student("吴十",'女',90.);
        AllStudents[8] = new Student("郑十一",'男',73);
        AllStudents[9] = new Student("王十二",'男',88);

        //提供两套业务实现方案，面向接口编程
        ClassDataInter2 cdi = new ClassDataInter2(AllStudents);
        cdi.printAllStudentInfos();
        cdi.printAverageScore();
    }
}
