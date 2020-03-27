package com.javaeasy.simplecopier;

public class Employee extends Thread {
    private int workTimes;
    private Copier copier;
    public Employee(String name, int workTimes, Copier copier){
        super(name);  //调用了父类的构造方法
        this.workTimes = workTimes;
        this.copier = copier;
    }
    //覆盖Thread类的run()方法
    public void run(){
        //this.getName代表当前线程的名字
        System.out.println(this.getName()+":开始工作。");
        for (int i = 0; i < workTimes; i ++){

            int pageAmount = (int)(5 * Math.random() + 1);
            //在调用copyPages()方法之前，首先输出一行字
            System.out.println("\""+this.getName()+"\"尝试调用\""+copier.getName()+"\"的copyPages()方法");
            copier.copyPages(pageAmount);
        }
        System.out.println(this.getName()+ "：完成了工作，下班。");
    }

}
