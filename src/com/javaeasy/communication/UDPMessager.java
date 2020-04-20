package com.javaeasy.communication;

import java.net.DatagramPacket;
import java.net.SocketAddress;
import java.util.List;

/**
 * 简单的聊天窗口（一）消息收发模块-对于发送消息的处理
 *未完成
 */
public class UDPMessager implements Messager {
    public static int DEFAULT_PORT= 9999;

    private List<DatagramPacket> messageList;

    @Override
    public void setMessageHandler(MessageHandler handler) {

    }

    public void sendData(byte[] data, SocketAddress addr){
        synchronized (messageList){
            DatagramPacket msg = null;
            msg = new DatagramPacket(data,data.length);
            msg.setSocketAddress(addr);
            messageList.add(msg);
            messageList.notify();
        }
    }

    @Override
    public void startMessenger() {

    }
}
