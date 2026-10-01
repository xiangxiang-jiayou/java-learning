package demo;
import java.util.Scanner;
public class MovieOperator {
    private Movie[] movies;
    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    public void printAllMovies() {
        //1.遍历数组
        //2.获取每一个电影对象
        //3.调用电影对象的show()方法
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
        }
    }

    public void searchMovieById() {
        //1.键盘录入电影编号
        //2.遍历数组
        //3.获取每一个电影对象
        //4.比较编号
        //5.找到了，输出电影信息
        //6.找不到，提示用户
        System.out.println("请输入要查询的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getId()+"\t"+m.getName()+"\t"+m.getPrice()+"\t"+m.getActor());
                return;
            }
      }
        System.out.println("没有找到该电影");
    }
}
