package com.javaeasy.waitnotify;

/**
 * 例程类
 */
public class SimpleWaitNotify {
    public static void main(String[] args){
        Object obj = new Object();
        //创建用于执行 wait()方法和notify()方法的Object类
        Waiting waiting = new Waiting(obj);
        Notifier notifier = new Notifier(obj);
        Thread waitingThread = new Thread(waiting,"挂起线程");
        Thread notifierThread = new Thread(notifier,"唤醒线程");
        waitingThread.start();
        notifierThread.start();
    }
}
