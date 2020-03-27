package com.javaeasy.learnsocketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPReceive {
    public static void main(String[] args){
        try {
            //构造用于接受数据信息的DatagramPacket对象
            System.out.println("构建DatagramPacket对象.....");
            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data,data.length);
            System.out.println("使用DatagramPacket对象接受数据......");
            //在7777端口监听，等待接受数据(构建一个在7777端口监听的DatagramSocket实例)
            DatagramSocket ds = new DatagramSocket(7777);
            ds.receive(dp);
            System.out.println("数据接受完毕。");
            byte[] recData = dp.getData(); //分析数据，输出到控制台
            int  len = dp.getLength();
            String content = new String(recData,0,len);
            System.out.println("接受到的  数据为："+ content);
            ds.close();
        } catch (SocketException e){
            e.printStackTrace();
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
