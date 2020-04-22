package com.javaeasy.utils;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * ChatUtils 类是一个工具类，它为三个模块服务
 */

public class ChatUtils {
    //消息的分隔符，以“#”号为分割符
    public static final String SEPARATOR = "#";
    //使用SEPARATOR属性，用户名和消息内容，构建一个byte数组，作为需要发送消息的内容
    public static byte[] buildMessage(String name,String content){
        String message = name + SEPARATOR + content;
        return message.getBytes();
    }
    //根据一个byte数组和SEPARATOR属性，解析出用户名和消息内容。
    public static String[] parseMessage(byte[] data){
        String message = new String(data);
        int pos = message.indexOf(SEPARATOR);
        if (pos == -1){
            System.out.println("收到不符合格式的消息:"+message);
            return null;
        }
        String[] msg = new String[2];
        msg[0] = message.substring(0,pos);
        msg[1] = message.substring(pos + 1);
        return msg;
    }
    //将窗口置于屏幕的中间
    public static void locateFrameCenter(JFrame frame){
        int framewidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int screenWidth = screen.width;
        int screenHeight = screen.height;
        frame.setLocation((screenWidth - framewidth) / 2,(screenHeight - frameHeight) / 2);

    }
    //将对话框置于屏幕的中间
    public static void locateDialogCenter(JDialog dialog){
        int frameWidth = dialog.getWidth();
        int frameHeight = dialog.getHeight();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screen = toolkit.getScreenSize();
        int screenWidth = screen.width;
        int screenHeight = screen.height;
        dialog.setLocation((screenWidth - frameWidth) / 2,(screenHeight - frameHeight) / 2);

    }
    //根据IP的格式和端口号，创建一个InetSocketAddress的实例，用于发送消息
    public static InetSocketAddress createSocketAddFromStr(String ipStr,String portStr){
        try {
            String[] numberStrs = ipStr.split("\\.");
            int len  = numberStrs.length;
            byte[] ipNumber = new byte[len];
            for (int i = 0;i < len; i++){
                ipNumber[i] = Short.valueOf(numberStrs[i]).byteValue();
            }
            InetSocketAddress addr = new InetSocketAddress(InetAddress.getByAddress(ipNumber),Integer.valueOf(portStr));
            return addr;
        } catch(UnknownHostException e){
            e.printStackTrace();
        } catch(NumberFormatException e){
            e.printStackTrace();
        }
        return null;
    }
}
