package com.javaeasy.car;

/**
 * 原因：子类ElectronicBus 导入继承的包的Bus类是另一个包中的，不在同一个包中
 * 因为之后导入的包都是同一个包中的，所以这里要把子类中导入的包去掉，不要导入包
 * 	在同一个目录下继承即可！切记！切记！切记！
 */
public  class ElectronicBus extends Bus {
    int carriageNumber = 2;
    public ElectronicBus(){
        System.out.println("ElectronicBus类的构造方法被调用了！");
    }

}