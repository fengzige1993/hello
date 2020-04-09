package com.javaeasy.learncomponent;

/**
 * Swing基本组件
 * JFrame 窗口
 */

import  java.awt.Container;
import  java.awt.Point;
import  javax.swing.JFrame;

public class LearnJFrame {
    public static void main(String[] args){
        JFrame frame = new JFrame("Hello World!");
        //创建一个JFrame类的实例
        frame.setSize(300,100);
        //设置窗口大小为宽300像素，高100像素
        frame.setLocation(new Point(100,300));
        //设置窗口左上角距离屏幕左边100像素，上面300像素
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口关闭时程序退出
        Container container = frame.getContentPane();
        //得到窗口的容器区域（暂未使用）
        frame.setVisible(true);
        //让窗口显示出来
    }
}
