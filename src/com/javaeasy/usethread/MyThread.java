package com.javaeasy.usethread;

public class MyThread extends Thread { //MyThread 继承自 Thread 类
    //覆盖了Thread类中的run()方法
    public void run(){
        System.out.println("这是在另一个线程中执行的代码");
    }
}
