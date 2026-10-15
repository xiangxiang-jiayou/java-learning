package com.xiangxiang.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("登录窗口");

        jf.setSize(400,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        JPanel jp = new JPanel();
        jf.add(jp);

        JButton jb = new JButton("登录");

        jp.add(jb);
        jf.setVisible(true);
        jb.addActionListener(new MyActionListener(jf));

    }
}

class MyActionListener implements ActionListener {
    private JFrame jf;
    public MyActionListener(JFrame jf) {
        this.jf = jf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(jf,"登录成功");
    }
}