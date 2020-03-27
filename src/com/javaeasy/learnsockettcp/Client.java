package com.javaeasy.learnsockettcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args){
        try {
            byte[] addr = new byte[]{127,0,0,1};
            InetAddress local = InetAddress.getByAddress(addr);
            Socket s = new Socket(local,7777);
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();
            System.out.println("=======下面是服务端发来的消息========");
            System.out.println(response);
            System.out.println("====================================");
            System.out.println("正在向服务器发送消息......");
            PrintWriter pw  = new PrintWriter(out);
            pw.write("服务器你好，这是客户端。");
            pw.flush();
            pw.close();
            br.close();
            s.close();
            System.out.println("向服务器发送消息结束.");
        } catch (UnknownHostException e){
            System.out.println("无法找到对应的机器，错误信息。"+e.getMessage());
        } catch (IOException e){
            System.out.println("数据传输出现异常"+e.getMessage());
        }


    }
}
