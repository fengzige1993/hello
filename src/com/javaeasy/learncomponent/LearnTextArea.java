package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * JtextArea Swing中的文本域
 *
 */
public class LearnTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 200);
        frame.setLocation(new Point(100, 300));
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JTextArea area = new JTextArea();
        //创建文本域对象
        area.setRows(7);
        area.setColumns(20);
        area.setText("这是一个文本域");//设置文本域上的字体
        JScrollPane scroll = new JScrollPane();
        //创建JScrollPane对象,得带滚动条
        scroll.setViewportView(area);
        //让文本域作为滚动条的视图
        container.add(scroll);
        //将滚动条加入到容器当中
        frame.setVisible(true);
        //显示窗口
    }
}
