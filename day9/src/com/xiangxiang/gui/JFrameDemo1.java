package com.xiangxiang.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class JFrameDemo1 {
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

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(jf,"登录成功");
            }
        });
        //按键事件
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                    JOptionPane.showMessageDialog(jf,"点击了enter" );
                }
        });
        jf.requestFocus();


    }
}
