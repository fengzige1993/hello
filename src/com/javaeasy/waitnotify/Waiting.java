package com.javaeasy.waitnotify;

/**
 * 线程同步之 wait()方法和notify()方法
 * 一个等待被唤醒的线程
 */

public class Waiting implements Runnable {
    private Object waitObj; //创建一个Object类的引用，为了调用 wait()和 notify()方法
    public Waiting(Object waitObj){
        this.waitObj = waitObj;
    }
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+":线程将挂起状态，等待被别的线程唤醒......");
        try {
            synchronized (waitObj){
                waitObj.wait();
            }
        } catch (InterruptedException e){
            System.out.println("对不起。程序运行出错，错误信息为："+e.getMessage());
            return;
        }
        //线程一旦被唤醒，将继续执行代码，向控制台输出一行文字
        System.out.println(name+"线程被唤醒了。");
    }
}

