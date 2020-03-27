package com.javaeasy.learnsockettcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("服务端在7777端口监听......");
            //如果没有客户端连接过来，accept()方法不会反回
            Socket s = ss.accept();
            System.out.println("已有客户端连接过来，开始进行通信......");
            InputStream in  = s.getInputStream();
            OutputStream out = s.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            System.out.println("正在向客户端发送信息......");
            pw.write("客户端，你好，这里是服务器端。\r\n");
            //强制发送数据
            pw.flush();
            System.out.println("向客户端发送消息完成。");
            //使用BufferedReader 读取客户端发送来的数据
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();
            System.out.println("===========下面是客户端发来的消息==========");
            System.out.println(response);
            System.out.println("==========================================");
            br.close();
            pw.close();
            s.close();
            ss.close();
        } catch (UnknownHostException e){
            System.out.println("无法找到相应的机器，错误信息。"+e.getMessage());
        } catch (IOException e){
            System.out.println("数据传输出现异常："+e.getMessage());
        }

    }
}
