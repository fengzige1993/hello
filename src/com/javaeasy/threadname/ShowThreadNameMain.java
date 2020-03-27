package com.javaeasy.threadname;

public class ShowThreadNameMain {
    public static void main(String[] args){
        //使用无参的构造方法创建Thread类实例，这时它将有一个默认的名字
        ShowThreadName  defaultName = new ShowThreadName();
        //使用构造方法给线程指定一个名字
        ShowThreadName name =  new ShowThreadName("线程的名字");
        //启动两个线程
        defaultName.start();
        name.start();
    }
}
//
//        个线程的名字是：Thread-0
//        这个线程的名字是：线程的名字