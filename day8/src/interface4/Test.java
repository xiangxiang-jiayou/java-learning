package interface4;

public class Test {
    public static void main(String[] args) {

        AImpl a = new AImpl();
        a.go();

        A.eat();

    }
}

class AImpl implements A{

}