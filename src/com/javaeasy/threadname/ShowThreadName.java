package com.javaeasy.threadname;

public class ShowThreadName extends Thread{
    public ShowThreadName(){ //构造方法没有参数
        super(); //调用父类的构造方法
    }
    public ShowThreadName(String name){
        super(name); //调用父类的构造方法
    }
    //覆盖run() 方法+
    public void run(){
        System.out.println("这个线程的名字是："+this.getName());
    }
}
