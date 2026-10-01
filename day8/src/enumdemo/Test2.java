package enumdemo;

public class Test2 {
    public static void main(String[] args) {
        //需求：模拟上下左右移动
        move(Direction.UP);

    }
//    public static void move(int direction){
//        switch (direction){
//            case Constant.UP:
//                System.out.println("向上移动");
//                break;
//            case Constant.DOWN:
//                System.out.println("向下移动");
//                break;
//            case Constant.LEFT:
//                System.out.println("向左移动");
//                break;
//            case Constant.RIGHT:
//                System.out.println("向右移动");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
//
//    }
//    //枚举
    public static void move(Direction direction){
        switch (direction){
            case Direction.UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
