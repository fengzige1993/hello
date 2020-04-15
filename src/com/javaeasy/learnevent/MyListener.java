package com.javaeasy.learnevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 * 事件处理类，实现了ActionListener接口
 */
public class MyListener implements ActionListener {
    int counter = 0;
    private JLabel label;//创建一个JLabel标签类的引用
    //构造方法
    public MyListener(JLabel label){  //参数是 JLabel类型的
        this.label = label;  //传参的值给到定义的引用变量
    }
    //事件处理方法，此方法在事件触发时被调用
    public void actionPerformed(ActionEvent e){
        counter++; //事件发生后，计数器加 1
        label.setText("事件触发了"+counter +"次");
    }
}
