package com.javaeasy.simplecopier;

/**
 * 线程挂起
 */

public class Copier {
    private String name;
    public Copier(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public synchronized void copyPages(int pages){
        Thread employee = Thread.currentThread();
        System.out.println(employee.getName()+ "\t正在使用复印机\t"+name);
        long time = pages * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e){
            System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
        }
        //向控制台输出哪个员工使用完了哪个复印机
        System.out.println(employee.getName()+"\t用完了打印机\t"+name);
    }
}
