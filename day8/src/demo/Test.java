package demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        JD[] jds = new JD[4];
        jds[0]= new TV("小米电视",true);
        jds[1] = new WashMachine("海尔洗衣机",false);
        jds[2] = new Lamp ("飞利浦台灯",true);
        jds[3] = new Air("格力空调",false);
        //为每个设备设置开关功能
         SmartHomeControl shc = SmartHomeControl.getInstance();
//        shc.control(jds[0]);
//        System.out.println("----------------------------");

        //提示用户操作：a.展示全部设备的当前情况，b.让用户选择哪一个操作
        //打印全部的设备的开和关的现状、
        while(true){
            shc.printAllstatus(jds);
            System.out.println("请你选择要控制的设备：");
            Scanner sc = new Scanner(System.in);
            String index = sc.next();
            switch (index){
                case "1":
                    shc.control(jds[0]);
                    break;
                case "2":
                    shc.control(jds[1]);
                    break;
                case "3":
                    shc.control(jds[2]);
                    break;
                case "4":
                    shc.control(jds[3]);
                case "exit":
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误");

            }
        }
    }
}

