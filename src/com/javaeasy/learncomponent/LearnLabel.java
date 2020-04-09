package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * JLabel :标签
 * 要把标签放到容器中
 */
public class LearnLabel {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        //创建一个JFrame实例，用来放置将来的JLabel实例
        frame.setSize(300,100);//设置窗口的大小，单位是像素
        frame.setLocation(new Point(100,300)); //设置窗口左上角距离屏幕左上角的距离
        frame.setTitle("学习Swing的组件");//设置窗口的标题
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //窗口关闭的时候，程序结束
        Container container = frame.getContentPane();
        //得到JFrame（窗口）的容器区域
        FlowLayout layout = new FlowLayout();
        //创建一个布局管理器类的实例
        container.setLayout(layout);
        //给容器设置布局管理器
        JLabel label = new JLabel();
        //创建一个标签类的实例
        label.setText("这是一个标签"); //设置标签上的字
        container.add(label);//将标签加入到容器中
        frame.setVisible(true);//显示出窗口
        try {
            Thread.sleep(5000);//让线程挂起5秒
            label.setEnabled(false);//让标签不可用，显示成灰色
            Thread.sleep(5000);
            label.setVisible(false);//让让标签不可见
            Thread.sleep(5000);
            label.setVisible(true);//让标签可见
            Thread.sleep(5000);
            label.setEnabled(true);//让标签可用
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
