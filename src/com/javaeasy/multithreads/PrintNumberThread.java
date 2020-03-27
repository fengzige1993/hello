package com.javaeasy.multithreads;

/**
 * 多个线程的程序
 * 一个超程序中有多个线程的程序（多线程编程）
 */

public class  PrintNumberThread extends Thread { //继承Thread类
    //嗯，可以看出定义这个参数就是为了控制循环次数的
    private int times;
    //构造方法以一个int变量为参数
    public PrintNumberThread(int times){
        this.times = times;
    }
    //覆盖THread类的run()方法
    public void run(){
        for (int i = 0 ; i < times; i++){
            //得到线程的名字
            String content = this.getName()+ "\t:\t" +i;
            try {
                this.sleep(1);   //让程序沉睡一毫秒钟
            } catch (InterruptedException e){
                System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
            }
            //输出程序的名字，每次循环都会输出线程的名字
            System.out.println(content);
        }
        System.out.println("线程\""+this.getName()+"\"结束了。");

    }
}
