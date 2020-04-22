package com.javaeasy.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/**
 * 简单的聊天窗口（二）消息收发模块-对于发送消息的处理
 *
 */
public class UDPMessager implements Messager {
    public static int DEFAULT_PORT= 9999;
    private DatagramSocket UDPWorker;
    private List<DatagramPacket> messageList;
    private MessageHandler handler;

    public UDPMessager() throws SocketException{
        this(DEFAULT_PORT);
    }

    public UDPMessager(int port) throws SocketException{
        UDPWorker = new DatagramSocket(port);
        messageList = new ArrayList<DatagramPacket>();
    }

    @Override
    public void setMessageHandler(MessageHandler handler) {
        this.handler = handler;
    }
    //在sendData()方法中，只是简答地将消息封装在DatagramPacket对象中，然后将它放入到messageList中
    //最后会唤醒等待在messageList上的线程（就是消息发送线程）
    public void sendData(byte[] data, SocketAddress addr){
        synchronized (messageList){
            DatagramPacket msg = null;
            msg = new DatagramPacket(data,data.length); //使用DatagramPacket 封装消息
            msg.setSocketAddress(addr);
            messageList.add(msg); //将消息加入列表中
            messageList.notify();//唤醒等待的消息发送线程
        }
    }
    //启动了两个线程，一个是负责发送消息，一个是负责接受消息
    @Override
    public void startMessenger() {
        Thread recvThread = new Thread(new MessageReceiver());
        recvThread.start(); //创建并启动消息接受线程
        Thread sendThread = new Thread(new MessageSender());
        sendThread.start();//创建并启动消息发送线程
    }
    class MessageReceiver implements Runnable{ //实现了Runnable接口
        public void run(){
            byte[] data = new byte[1024]; //接受到的数据长度
            while (!Thread.currentThread().isInterrupted()){
                //循环，不打断就执行，打断就停止执行
                DatagramPacket msg = new DatagramPacket(data,data.length);
                try {
                    UDPWorker.receive(msg); //接受消息，如果没有消息则挂起等待
                } catch (IOException e){
                    e.printStackTrace();
                }
                byte[] recvData = msg.getData();//构造接受到的消息
                byte[] realData = new byte[msg.getLength()];
                System.arraycopy(recvData,0,realData,0,msg.getLength());
                //调用消息处理方法，将接受到的数据作为参数传递
                handler.handleMessage(realData,msg.getSocketAddress());
            }
        }
    }
    class MessageSender implements Runnable{
        public void run(){
            while (!Thread.currentThread().isInterrupted()){
                DatagramPacket msg = getData(); //调用getData()方法
                try {
                    UDPWorker.send(msg);//发送数据
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
    private DatagramPacket getData(){
        synchronized (messageList){
            while (messageList.size() == 0){
                try {
                    messageList.wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            DatagramPacket data = messageList.get(messageList.size() - 1);
            messageList.remove(messageList.size() - 1);
            return data;
        }
    }


}
