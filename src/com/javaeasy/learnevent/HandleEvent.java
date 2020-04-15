package com.javaeasy.learnevent;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 测试历程，使用事件处理类
 */

public class HandleEvent {
    //定义属性，窗口以及窗口中的组件
    private JFrame frame;
    private JButton button;
    private JLabel label;
    //构造方法
    public HandleEvent(){
        //创建窗口以及窗口中的组件
        frame = new JFrame();
        button = new JButton("有事件处理器的按钮");
        label = new JLabel();
        init();//调用 init（）方法
    }
    //构建窗口,设置窗口属性
    public void init(){
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的事件处理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2,1));
        container.add(label);
        container.add(button);
        MyListener listener = new MyListener(label);
        button.addActionListener(listener);//添加按钮事件监听器
    }
    //显示窗口
    public void showFrame(){
        frame.setVisible(true);
    }
    //main()方法
    public static void main(String[] args){
        HandleEvent handleEvent = new HandleEvent();
        handleEvent.showFrame();
    }
}
