package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing中的按钮组件JButton
 */
public class LearnButton {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        //frame 调用 getContentPane()方法 然后赋值给了 Container类的引用 container
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        //调用Container类里的 setLayout方法，把布局管理器放到容器里
        JButton button = new JButton();
        button.setText("按钮");
        container.add(button);
        //将按钮添加到容器里
        frame.setVisible(true);
    }
}
