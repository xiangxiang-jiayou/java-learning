package javabean;

public class test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setChinese(100);
        s.setMath(100);
        System.out.println(s.getName()+" "+s.getChinese()+" "+s.getMath());

        Student s2 = new Student("李四",59,80);
        System.out.println(s2.getName()+" "+s2.getChinese()+" "+s2.getMath());

        StudentService service = new StudentService(s);
        service.printTotalScore();
        service.printAverageScore();

    }

}

