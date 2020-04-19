package com.javaeasy.learnevent;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 使用内部类
 * 这时MyListener 是 HandleEvent2的一个内部类
 * 可以直接访问HandEvent2的属性
 */
public class HandleEvent2 {
    //内部类实现了 ActionListener接口
    class MyListener implements ActionListener{
        int counter = 0;
        public void actionPerformed(ActionEvent e){
            counter ++;
            label.setText("事件触发了"+counter +"次。");
        }
    }

    //定义属性，窗口以及窗口中的组件
    private JFrame frame;
    private JButton button;
    private JLabel label;
    //构造方法
    public HandleEvent2(){
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
        MyListener listener = new MyListener();
        //创建一个内部类的实例
        button.addActionListener(listener);//添加按钮事件监听器
    }
    //显示窗口
    public void showFrame(){
        frame.setVisible(true);
    }
    //main()方法
    public static void main(String[] args){
        HandleEvent2 handleEvent = new HandleEvent2();
        handleEvent.showFrame();
    }
}
