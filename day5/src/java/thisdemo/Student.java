package java.thisdemo;

public class Student {
    String name;
    public void print(){
        //那个对象拿到这个方法，就调哪个this

        System.out.println(this);
        System.out.println(this.name);
    }
    //爱好
    public void hobby(String name){
        System.out.println(this.name+"喜欢"+name);
    }
}
