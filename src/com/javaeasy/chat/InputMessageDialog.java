package com.javaeasy.chat;

        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import javax.swing.JButton;
        import javax.swing.JDialog;
        import javax.swing.JLabel;
        import javax.swing.JSeparator;
        import javax.swing.JTextField;
        import com.javaeasy.utils.ChatUtils;

/**
 * 一个通用的多行输入的聊天对话框
 */

public class InputMessageDialog extends JDialog {
    private String[][] items;//一个二维数组
    private JTextField[] values;
    private String[] retValues;
    //是一个通用的可以接受用户多行输入的对话框，接收了一个二维的String数组作为参数
    public InputMessageDialog(Frame owner,String title,boolean modal,String[][] items){
        super(owner,title,modal); //这三个参数调用父类
        this.items = items;
        init();
    }
    private void init(){
        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int count = items.length;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.NONE;
        gbc.insets = new Insets(3,3,3,3);
        for (int i = 0; i < count ;i++){
            gbc.gridy = i;
            container.add(new JLabel(items[i][0]),gbc);
        }
        values = new JTextField[count];
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        for (int i = 0; i < count ; i++){
            gbc.gridy = i;
            values[i] = new JTextField(items[i][1]);
            container.add(values[i],gbc);
        }
        gbc.gridx = 0;
        gbc.gridy = count;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.SOUTH;
        container.add(new JSeparator(),gbc);

        gbc.gridy = count + 1;
        gbc.weightx = 1.0;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(7,7,7,7);
        JButton btn = new JButton("确定");
        container.add(btn,gbc);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retValues = new String[items.length];
                for (int i = 0; i < retValues.length; i++){
                    retValues[i] = values[i].getText();
                }
                InputMessageDialog.this.dispose();
            }
        });
        this.setSize(300,count * 30 + 70);
        ChatUtils.locateDialogCenter(this);
    }
    public String[] getValue(){
        return retValues;
    }
}
