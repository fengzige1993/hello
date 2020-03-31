package com.javaeasy.waitnotify;

/**
 * 实现了Runnable接口的Notify类
 */
public class Notifier implements Runnable {
    private Object notifyObj;
    public Notifier(Object notifyObj){
        this.notifyObj = notifyObj;
    }
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name+":将挂起5秒钟");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
        }
        System.out.println(name+":开始notify线程");
        //synchronized代码块（有参数、方法体）
        synchronized (notifyObj) {//获得notifyObj的对象锁
            notifyObj.notify(); //调用notify()方法，唤醒因为调用wait()而挂起的线程
        }
        //唤醒结束后，向控制台输出下一行文字
        System.out.println(name+":notify 线程结束");
    }

}
