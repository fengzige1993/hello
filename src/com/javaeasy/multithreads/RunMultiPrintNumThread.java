package com.javaeasy.multithreads;

/**
 * 多个线程执行代码的顺序是随机的，速率也是随机的
 */

public class RunMultiPrintNumThread {

    public static void main(String[] args){
        PrintNumberThread threadOne = new PrintNumberThread(3);
        PrintNumberThread threadTwo = new PrintNumberThread(5);
        threadOne.setName("线程1");
        threadTwo.setName("线程2");
        threadOne.start();
        threadTwo.start();
        System.out.println("主线程结束了。");
    }
}
//多个线程执行代码的顺序是随机的，速率也是随机的（如何协调好线程之间的顺讯呢）
//主线程结束了。
//        线程1	:	0
//        线程2	:	0
//        线程2	:	1
//        线程2	:	2
//        线程1	:	1
//        线程2	:	3
//        线程2	:	4
//        线程"线程2"结束了。
//        线程1	:	2
//        线程"线程1"结束了。