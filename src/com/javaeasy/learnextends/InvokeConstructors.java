package com.javaeasy.learnextends;

public class InvokeConstructors {
    public static void main(String[] args){
        System.out.println("================开始创建Bus类的对象===============================");
        Bus bus = new Bus();
        System.out.println("================创建Bus类的对象结束================================");
        System.out.println();
        System.out.println("================开始创建SportsCar类的对象=============================");
        SportsCar sportsCar = new SportsCar("红色",200,"红色跑车",0,90);
        System.out.println("================创建SportsCar类对象结束===============================");

    }
}
// 通过例程可以发现，子类的构造方法的第一行总会是父类构造方法。或者编程中使用super来指定，如果不指定，java编译器就会默认指定
//父类无参数的构造方法。
//因为子类的构造方法的第一行总会去调用其父类的某个构造方法，所以父类的构造方法中的代码总会先于子类执行。

//================开始创建Bus类的对象===============================
//        CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了!
//        ================创建Bus类的对象结束================================
//
//        ================开始创建SportsCar类的对象=============================
//        CarBase类的有参数构造方法被调用了!
//        SportsCar类有参数的构造方法被调用
//        ================创建SportsCar类对象结束===============================

