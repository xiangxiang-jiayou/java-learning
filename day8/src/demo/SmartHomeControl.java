package demo;

public class SmartHomeControl {
    private  SmartHomeControl(){}
    private static final SmartHomeControl shc = new SmartHomeControl();
    public static SmartHomeControl getInstance() {
        return shc;
    }
    public void control(JD jd){
        System.out.println(jd.getName()+"的状态为:\t"+(jd.isStatus()?"打开":"关闭"));
        System.out.println("控制家电"+jd.getName());
        jd.press();
        System.out.println("操作后"+jd.getName()+"的状态为:\t"+(jd.isStatus()?"打开":"关闭"));
        System.out.println("******************************");
    }
   public void printAllstatus(JD[] jds){
        //使用for循环遍历数组，根据索引
       for (int i = 0; i < jds.length; i++) {
           System.out.println(jds[i].getName()+"的状态为:\t"+(jds[i].isStatus()?"打开":"关闭"));
       }

   }

}
