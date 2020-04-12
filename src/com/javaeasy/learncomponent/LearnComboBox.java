package com.javaeasy.learncomponent;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Point;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.xml.bind.JAXBContext;

/**
 * JComboBox 创建组合框（下拉框）
 *
 */

public class LearnComboBox {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(300,100);
        frame.setLocation(100,300);
        frame.setTitle("学习Swing的组件");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        FlowLayout layout = new FlowLayout();
        container.setLayout(layout);
        JComboBox combo = new JComboBox(new Object[] {"选项一","选项二"});
        //创建了一个JComboBox的构造方法，参数是一个 Object数组
        //使用Object数组作为参数创建一个JComboBox对象
        combo.addItem("选项三");
        //向JComboBox对象中添加一个元素
        combo.setSelectedIndex(1);
        //这是第二个元素为选中元素
        Object obj = combo.getSelectedIndex();
        //得到当前选中的索引下标
        Object obj2 = combo.getSelectedItem();
        //得到当前选中的元素
        System.out.println("当前选中的选项是："+obj+obj2);
        //输出当前选中的元素
        container.add(combo);
        //把组合框添加到容器区域
        frame.setVisible(true);
        //设置窗口可见
    }
}
