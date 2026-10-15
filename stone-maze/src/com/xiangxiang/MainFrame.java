package com.xiangxiang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;

public class MainFrame extends JFrame {
    //图片位置:src 是源码根,所以 src\image\tiles 对应类路径里的 /image/tiles/
    private static final String imageDir = "/image/tiles/";
    //准备一个数组存16个图片二维
    private int[][] imageData = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}

    };
    private int[][] winData = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}

    };
    //定义两个整数变量记录当前空白色块位置
    private int row;
    private int col;
    private int count;



    public MainFrame() {
        initFrame();
        //打乱顺序
        initRandomArray();
        //初始化界面
        initImage();
        //初始化系统菜单
        initMenu();
        //给当前窗口绑定上下左右事件
        initKeyPressEvent();

        this.setVisible(true);
    }

    private void initKeyPressEvent() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //判断按下的键是上下左右哪个
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_UP:
                        swtichandMove(Direction.UP);
                        //上
                        break;
                    case KeyEvent.VK_DOWN:
                        swtichandMove(Direction.DOWN);
                        //下
                        break;
                    case KeyEvent.VK_LEFT:
                        swtichandMove(Direction.LEFT);
                        //左
                        break;
                    case KeyEvent.VK_RIGHT:
                        swtichandMove(Direction.RIGHT);
                        break;
                    //右
                }
            }
        });
    }

    private void swtichandMove(Direction direction) {
        //判断移动方向
        switch (direction) {
            case UP:
                //空白不能在最后一行0 1 2
              if(row< imageData.length-1){
                  //交换空白块和下面数字
                  int temp = imageData[row][col];
                  imageData[row][col] = imageData[row + 1][col];
                  imageData[row + 1][col] = temp;
                  row++;
                  count++;
              }
                //上
                break;
            case DOWN:
                //空白不能在第一行
                if(row>0){
                    //交换空白块和上面数字
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row - 1][col];
                    imageData[row - 1][col] = temp;
                    row--;
                    count++;
                }
                //下
                break;
            case LEFT:
                //空白不能在最后一列
                if(col< imageData.length-1){
                    //交换空白块和右边数字
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col + 1];
                    imageData[row][col + 1] = temp;
                    col++;
                    count++;
                }
                //左
                break;
            case RIGHT:
                //空白不能在第一列
                if(col>0){
                    //交换空白块和左边数字
                    int temp = imageData[row][col];
                    imageData[row][col] = imageData[row][col - 1];
                    imageData[row][col - 1] = temp;
                    col--;
                    count++;
                }
                //右
                break;
        }
        //重新绘制界面
        initImage();

    }

    private void initRandomArray() {
        //打乱二维数组元素顺序4行4列
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                //随机一个行号
                int randomRow = (int) (Math.random() * imageData.length);
                //随机一个列号
                int randomCol = (int) (Math.random() * imageData[i].length);
                //交换 imageData[i][j] 和 imageData[randomRow][randomCol]
                int temp = imageData[i][j];
                imageData[i][j] = imageData[randomRow][randomCol];
                imageData[randomRow][randomCol] = temp;
            }
        }
        //定位空白块位置。
        OUT:
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++)
                if (imageData[i][j] == 0) {
                    row = i;
                    col = j;
                    break OUT;
                }
        }
    }

    private void initMenu() {
        //点击要显示退出和重启
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("系统");
        JMenuItem exitJi = new JMenuItem("退出");
        menu.add(exitJi);
        exitJi.addActionListener(e -> {
            dispose();
        });
        JMenuItem restartJi = new JMenuItem("重启");
        menu.add(restartJi);
        restartJi.addActionListener(e -> {
            count=0;
           //重启游戏
            initRandomArray();
            initImage();
                });
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
    }
    private void initImage() {
        //清空面板
        this.getContentPane().removeAll();
        //增加一个count的显示
        JLabel countTxt = new JLabel("步数: " + count);
        countTxt.setBounds(20, 20, 100, 20);
        countTxt.setForeground(Color.blue);
        this.add(countTxt);

        //判断是否获胜
        if(isWin()){
            JLabel label = new JLabel(new ImageIcon(imageDir + "win.png"));
            label.setBounds(0, 0, 450, 484);
            this.add(label);
        }

        //重新绘制
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
              //注意是 .png,不是 .gng
              String imageName = imageData[i][j] + ".png";

              //从类路径取图片:找不到会返回 null,能立刻发现问题
              //(原来 new ImageIcon("路径") 找不到时不报错,只会变成空图标,窗口一片白)
              URL url = MainFrame.class.getResource(imageDir + imageName);
              if (url == null) {
                  System.out.println("找不到图片: " + imageDir + imageName);
                  continue;
              }
              //原图是 256x256,格子只有 100x100,不缩放只会看到图片左上角那一块
              Image scaled = new ImageIcon(url).getImage()
                                .getScaledInstance(100, 100, Image.SCALE_SMOOTH);

              JLabel label = new JLabel(new ImageIcon(scaled));
              label.setBounds(20+j * 100, 60+i * 100, 100, 100);
              this.add(label);
            }
        }
        JLabel background = new JLabel(new ImageIcon(imageDir + "black.png"));
        background.setBounds(0, 0, 450, 484);
        this.add(background);
        //重新绘制
        this.repaint();

    }

    private boolean isWin() {
        for (int i = 0; i < imageData.length; i++) {
            for (int j = 0; j < imageData[i].length; j++) {
                if (imageData[i][j] != winData[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private void initFrame() {
        this.setTitle("石头迷宫 V 1.0 dlei");
        this.setSize(465, 575);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);




    }
}
