package abstruct3;

public abstract class People {
    public final void write(){
        System.out.println("<我的爸爸>");//第一段固定
        System.out.println("我的爸爸是一个好人");
        writeMain();
        System.out.println("我的爸爸会开飞机");//第三段固定

    }
    public abstract void writeMain();
}

