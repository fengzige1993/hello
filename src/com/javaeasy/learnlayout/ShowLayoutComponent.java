package com.javaeasy.learnlayout;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

/**
 * GridLayout 平局分割容器的单元格
 * Gridlayout 的限制性显而易见，每个单元格的大小都是相同的
 * 并且每个组件只能占用一个单元格
 */
public class ShowLayoutComponent {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menuBar.add(new JMenu("这是菜单。"));
        frame.setSize(600,150);
        frame.setTitle("这是一个窗口");
        Container container = frame.getContentPane();
        container.setLayout(new GridLayout(3,2));
        //创建布局管理器,参数3和2分别代表分割的行数和列数
        container.add(new JLabel("这是一个标签，用户可以用它显示文字。"));
        container.add(new JTextField("这是一个文本框，用户可以用它输入文字"));
        container.add(new JComboBox(new Object[]{"这是一个组合框，可以用来下拉并选择其中的条目"}));
        container.add(new JButton("这是一个按钮，用户可以单击按钮。"));
        frame.setVisible(true);
    }
}
