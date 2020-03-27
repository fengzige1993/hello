package com.javaeasy.learnsocketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSender {
    public static void main(String[] args){
        try {
            //构建一个发送数据的DatagramPacket对象，包括数据、目的IP地址和目的端口
            System.out.println("构建DatagramPacket对象.....");
            String content = "使用UDP传输数据。";
            byte[] data = content.getBytes();
            DatagramPacket dp = new DatagramPacket(data,data.length);
            byte[] addr = new byte[]{127,0,0,1};
            InetAddress local = InetAddress.getByAddress(addr);
            dp.setAddress(local);
            dp.setPort(7777);
            System.out.println("发送DatagramPacket对象......");
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            System.out.println("发送结束。");
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
