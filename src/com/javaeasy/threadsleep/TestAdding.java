package com.javaeasy.threadsleep;

/**
 * 写一个TestAdding 类，用来完成加法测验的功能
 */

public class TestAdding {
    public void giveAddingTest(){
        int a = (int) (100 * Math.random());
        int b = (int) (100 * Math.random());
        System.out.println("请在5秒内计算出下面两个整数的和："+ a +"+"+b);
        String currThreadName = Thread.currentThread().getName();
        System.out.println("执行当前代码的线程名叫做："+currThreadName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
            return;
        }
        int result = a + b ;
        System.out.println(a +"+"+b+"的运算结果为：" +result);
    }
}
