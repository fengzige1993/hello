package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * JTextFied 类
 * 文本框
 */
public class LearnText {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,100);//窗口的大小
        frame.setLocation(new Point(100,300));//窗口的位置（窗口左上角距离屏幕左上角的巨鹿）
        frame.setTitle("学习Swing的组件");//窗口的标题
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置在关闭窗口时的操作（窗口关闭，程序结束）
        Container container = frame.getContentPane();//得到窗口的容器区域（可以容纳其他组件的区域）
        FlowLayout layout = new FlowLayout();//创建一个布局管理器类的实例
        container.setLayout(layout);//给容器设置布局管理器
        JTextField txt = new JTextField();//创建文本框类的实例
        txt.setText("这是一个文本框");//设置文本框上的文字
        container.add(txt);//将文本框加入到容器里
        frame.setVisible(true);//让窗口显示出来
        try {
            Thread.sleep(10000);//让线程挂起10秒钟
            String content = txt.getText();//得到文本框上的字符串
            System.out.println(content);//打印输出到控制台
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
