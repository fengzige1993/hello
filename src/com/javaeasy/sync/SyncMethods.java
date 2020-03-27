package com.javaeasy.sync;

/**
 * created by hufeng in 2020年03月25号
 */
public class SyncMethods {
    public synchronized static void syncStaticMethod1(){
        System.out.println("这是一个静态的同步方法1");
    }

    public synchronized static void syncStaticMethod2(){
        System.out.println("这是一个静态的同步方法2");
    }

    public static void staticMethod(){
        System.out.println("这是一个静态的方法");
    }

    public synchronized void syncMethod1(){
        System.out.println("这是一个同步方法1");
    }
    public synchronized void syncMethod2(){
        System.out.println("这是一个同步方法2");
    }
    public synchronized void method(){
        System.out.println("这是一个同步方法3");
    }


}
