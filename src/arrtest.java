public class arrtest {
    public static void main(String[] args) {
        start(5);

    }
    public static void start(int n) {
//        初始化二维数组
        int count = 1;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = count++;
            }
        }
        //输出二维数组
        printArray(arr);
        //打乱二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int x = (int) (Math.random() * arr.length);
                int y = (int) (Math.random() * arr.length);
                int temp = arr[i][j];
                arr[i][j] = arr[x][y];
                arr[x][y] = temp;
            }
            printArray(arr);

        }
    }
        public static void printArray(int[][] arr1)

        {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++)
                    System.out.print(arr1[i][j] + "\t");
                System.out.println();
            }
            System.out.println();
        }
}