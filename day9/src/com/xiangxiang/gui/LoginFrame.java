package com.xiangxiang.gui;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {
        this.setTitle("登录窗口");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    init();
}


        private void init() {
            JPanel jp = new JPanel();
            this.add(jp);

            JButton jb = new JButton("登录");
            jb.addActionListener(this);

            jp.add(jb);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(this,"我被点击了");
        }
    }

