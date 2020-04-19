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
 * 使用匿名类实现事件监听器接口
 * 定义匿名内部类和创建一个匿名内部类对象的语法是绑在一起的
 * 语法如下：
 * new 抽象类型名（构造方法的实际参数）{实现了抽象类型中的抽象方法};
 * 用分号作为结束符
 * 抽象类型名是接口时：
 * 理解匿名类的语法含义：
 * 它创建的不是接口的对象，而是创建了一个没有名字的、实现了这个接口的类的对象
 *
 */


public class HandleEventⅢ {
    private JFrame frame;
    private JButton button;
    private JLabel label;
    public HandleEventⅢ(){
        frame = new JFrame();
        button = new JButton("事件处理器的按钮");
        label = new JLabel();
        init();
    }
    public void init(){
        frame.setSize(300,100);
        frame.setLocation(new Point(100,300));
        frame.setTitle("学习Swing的事件处理");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(2,1));
        container.add(label);
        container.add(button);
        //创建一个匿名内部类的实例，参数是一个匿名内部类，用分号结束
        button.addActionListener(new ActionListener() {
            int counter = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("事件触发了"+counter+"次。");
            }
        });
    }
    public void showFrame(){
        frame.setVisible(true);
    }
    public static void main(String[] args){
        HandleEventⅢ handleEvent = new HandleEventⅢ();
        handleEvent.showFrame();
    }
}
