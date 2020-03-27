package com.javaeasy.usethread;

public class UseRunnable {
    public static void main(String[] args){
        //创建一个线程。参数为一个实现了Runnable接口的匿名类的实例
        Thread thread = new Thread(new  Runnable(){
            public void run(){   //实现抽象方法Run()
                System.out.println("这是在另一个线程中执行的代码。");
            }
        });
        //启动线程
        thread .start();
    }
}
