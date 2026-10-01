package java.thisdemo;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "wjm";
        s1.print();
        System.out.println(s1);
        System.out.println();

        Student s2 = new Student();
        s2.name = "zhx";
        s2.print();
        System.out.println(s2);
        System.out.println();

        Student s3 = new Student();
        s3.name = "zxy";
        s3.hobby("luguan");
    }
}