package staticmethod;

public class Student {

    private double score;
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public void printPass(){
        System.out.println(score>=60?"及格":"不及格");

    }
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
