package com.javaeasy.learnextends;

public class LearnConstructors {
    public static void main(String[] args){
        System.out.println("=============开始创建ElectronicBus类的对象=================");
        ElectronicBus eBus = new ElectronicBus();
        System.out.println("=============创建ElectronicBus类的对象结束===============");
        System.out.println();
        System.out.println("=============开始创建SportsCar()类的对象=================");
        SportsCar sportsCar = new SportsCar();
        System.out.println("=============创建SportsCar类的对象结束===================");

    }
}

//=============开始创ElectronicBus类的对象=================
//        CarBase类的构造方法被调用了!
//        Bus类的构造方法被调用了!
//        ElectronicBus类的构造方法被调用了！
//        =============创建ElectronicBus类的对象结束===============
//
//        =============开始创建SportsCar()类的对象=================
//        CarBase类的构造方法被调用了!
//        SportsCar类的构造方法被调用了！
//        =============创建SportsCar类的对象结束===================
// java在创建一个类的对象之后，就会给出调用相应的构造方法。也就是说在我们创建一个类的对象之后，java平台就会调用这个类的构造方法
// 创建一个类的对象的过程，首先创建这个类的父类对象，然后创建这个类的对象。这个一个循环递归的过程。