package com.javaeasy.waitnotify;

/**
 * 例程类
 * 首先启动了唤醒线程，然后再启动挂起线程，这样线程就会永远挂起
 *
 */
public class ErrorSequence {
    public static void main(String[] args){
        Object obj = new Object();
        Waiting waiting = new Waiting(obj);
        QuickNotifier notifier = new QuickNotifier(obj);
        Thread waitingThread = new Thread(waiting,"挂起线程");
        Thread notifierThread = new Thread(notifier,"唤醒线程");
        notifierThread.start();//首先启动唤醒线程
        waitingThread.start();//然后启动挂起线程
    }
}
