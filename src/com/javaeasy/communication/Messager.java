package com.javaeasy.communication;

import java.net.SocketAddress;

public interface Messager {
    public void setMessageHandler( MessageHandler handler);
    public void sendData(byte[] data,SocketAddress addr);
    public void startMessenger();
}
