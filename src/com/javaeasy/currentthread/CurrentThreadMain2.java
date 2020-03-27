package com.javaeasy.currentthread;

public class CurrentThreadMain2 {
    public static void main(String[] args){
        //创建一个 Runbable接口的匿名内部类的实例
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                PrintCurrentThreadName  printer = new PrintCurrentThreadName();
                printer.printCurrentThreadName();
            }
        };

        //使用runnable创建一个线程，线程的名字叫做 “线程-1”
        Thread thread = new Thread(runnable,"线程-1");
        thread.start();
    }
}
