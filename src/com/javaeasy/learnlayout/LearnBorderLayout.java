package com.javaeasy.learnlayout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * BorderLayout 东南西北中 布局管理器
 *BorderLayout 在窗口大小改变的时候，会动态改变容器内组件的大小
 */

public class LearnBorderLayout {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,300);
        frame.setLocation(new Point(100,300));
        frame.setTitle("Swing的布局管理器");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        BorderLayout layout = new BorderLayout();
        //创建一个BorderLayout类的实例
        container.setLayout(layout);
        //将组件放到容器中
        JButton btn1 = new JButton("东");
        JButton btn2 = new JButton("西");
        JButton btn3 = new JButton("南");
        JButton btn4 = new JButton("北");
        JButton btn5 = new JButton("中");
        //创建5个 JButton类的实例
        container.add(btn1,BorderLayout.EAST);
        //将按钮添加到容器的东边，也就是右边
        container.add(btn2,BorderLayout.WEST);
        //将按钮添加到容器的西边，也就是左边
        container.add(btn3,BorderLayout.SOUTH);
        //将按钮添加到容器的南边，也就是下边
        container.add(btn4,BorderLayout.NORTH);
        //将按钮添加到容器的北边，也就是上边
        container.add(btn5,BorderLayout.CENTER);
        //将按钮添加到容器的中间
        /*
         * 当在容器中使用了BorderLayout后，向容器中添加组件就需要使用两个参数的add()方法
         * 其中第二个参数是给布局管理器使用，用来标识组件位置
         *
         */
        frame.setVisible(true);
    }
}
