package com.javaeasy.usethread;


public class UseMyThread {
    //两个线程，一个执行main方法，一个执行.start()
    //
    public static void main(String[] args){
        MyThread thread = new MyThread(); //创建一个Thread 类的实例
        thread.start();  //启动一个新的线程
        System.out.println("这是在main()方法中执行代码"); //启动线程后，再输出一行代码
    }
}
