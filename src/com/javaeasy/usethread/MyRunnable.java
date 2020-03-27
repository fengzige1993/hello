package com.javaeasy.usethread;

/**
 * MyRunnable 实现了 Runnable 接口，其run()方法就是 线程会执行的方法，然后就例程
 */
public class MyRunnable implements Runnable{    //实现Runnable接口
    public void run(){      //实现 run() 方法
        System.out.println("这是在另一个线程中执行的代码。");//向控制台输出一行字，run()方法结束
    }

}
