package demo;

public class test {
    public static void main(String[] args) {
        //目标：完成面向对象的综合小案例
        //1.设计电影类，以便创建电影对象，封装电影数据
        //2.封装数据
     Movie[] movies = new Movie[6];
     //Movies = [null,null,null,null,null,null]
     movies[0] = new Movie(1,"战狼2",37.99,"吴京");
     movies[1] = new Movie(2,"流浪地球",35.99,"屈楚萧");
     movies[2] = new Movie(3,"哪吒之魔童降世",35.99,"吕艳婷");
     movies[3] = new Movie(4,"复仇者联盟4",35.99,"小罗伯特·唐尼");
     movies[4] = new Movie(5,"星际穿越",9.6,"安妮海瑟薇");
     movies[5] = new Movie(6,"让子弹飞",35.99,"9.2");

     //3.创建电影操作对象出来，专门负责电影数据的业务操作。
        MovieOperator mo = new MovieOperator(movies);
        mo.printAllMovies();


        mo.searchMovieById();

    }
}
