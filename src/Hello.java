/**
 * 第一个 Java 程序：确认环境可用。
 */
public class Hello {

    public static void main(String[] args) {
        String name = "xiangxiang";
        System.out.println("Hello, " + name + "!");
        System.out.println("Java 版本: " + System.getProperty("java.version"));
        System.out.println("操作系统: " + System.getProperty("os.name"));
    }
}
