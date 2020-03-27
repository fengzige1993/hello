package com.javaeasy.currentthread;

public class PrintCurrentThreadName {
    public void printCurrentThreadName(){
        //Thread.currentThread()方法得到当前线程的引用，并将它赋值给currentThread
        Thread currentThread = Thread.currentThread();
        //得到当前线程的名字
        String threadName = currentThread.getName();
        System.out.println("执行代码的线程名叫做："+threadName);
    }
}
