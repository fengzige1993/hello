package com.javaeasy.learnlayout;


import java.awt.Container;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GridBagLayout 布局管理器
 */


public class LearnLayout{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的布局管理器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        GridBagLayout layout = new GridBagLayout();
        container.setLayout(layout);
        //将GridBagLayout布局管理器添加到容器中
        GridBagConstraints gbc = new GridBagConstraints();
        //当使用GridBagLayout作为布局管理器时，add()方法的第二个参数必需是一个GridBagConstraints类的实例
        JButton btn1 = new JButton("按钮1");
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.ORANGE);
        JButton btn2 = new JButton("按钮2");
        JButton btn3 = new JButton("按钮3");
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        //添加了2个面板三个按钮，并给面板添加上背景色
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;//不改变组建的大小，即保持组件原有大小
        container.add(btn1,gbc);
        //添加第一个组件，按钮1，位置（0,0）宽高（1,1）
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;//不改变组建的大小，即保持组件原有大小
        container.add(panel1,gbc);
        //添加第二个组件，面板
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;//改变组件原有大小，填满分配给这个组件的空间
        gbc.weightx = 1.0;//窗口大小改变时，按比例占用增加的宽度值
        gbc.weighty = 0;//窗口大小改变时，不占用增加的高度值
        container.add(btn2,gbc);
        //添加了第三个组件，按钮
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 0;
        gbc.weighty = 0;
        container.add(btn3,gbc);
        //添加了第四个组件，按钮
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        container.add(panel2,gbc);
        //添加了第五个组件，面板
        frame.setVisible(true);
        //让窗口显示
    }
}
