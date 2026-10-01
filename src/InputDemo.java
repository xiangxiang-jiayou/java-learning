import java.util.Scanner;
public class InputDemo {
    public static void main(String[] args){
        int a = 5, b = 6;
        if(a++ > 5 && ++b > 6){
            System.out.println("短路与计算");
        }
        System.out.println("a = " + a + " b = " + b);//a=6,b=6
    }

}
