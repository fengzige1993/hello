package com.javaeasy.usethread;

public class UseMyRunnable {
    public static void main(String[] args){
        //创建一个MyRunnable类的实例，因为MyRunnable，实现了Runnable接口（实现了其中定义的Run（）方法）
        MyRunnable runnable = new MyRunnable();
        //然后调用thread 类的构造方法，传入参数
        Thread thread = new Thread(runnable);

        //启动线程
        thread.start();
    }
}