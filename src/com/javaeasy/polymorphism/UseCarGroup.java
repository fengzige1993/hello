package com.javaeasy.polymorphism;

import com.javaeasy.override.Bus;
import com.javaeasy.override.CarBase;
import com.javaeasy.override.ElectronicBus;
import com.javaeasy.override.SportsCar;

public class UseCarGroup {
    public static void main(String[] args){
    //创建一个CarBase对象用来领队
    CarBase leading  = new SportsCar();

    //创建一个CarBase数组
    CarBase[] followingCars = new CarBase[]{new CarBase(),new SportsCar(), new Bus(), new ElectronicBus()};
    //可以在创建数组之后的中括号里{}写出数组元素的值，此方法同样适用创建对象的数组中
    int[] a = new int[]{1,2,3};
    for (int i=0; i < a.length; i++){
        int b = a[i];
        System.out.println("自建数组 b 的元素为："+b);
    }
    //创建车队对象
    CarGroup group = new CarGroup(leading,followingCars);
    group.speedUp(50);   //车队加速
    group.slowDown(10); //车队减速
    }
}
//
//    CarBase类的构造方法被调用了
//
//    CarBase类的构造方法被调用了
//            CarBase类的构造方法被调用了
//    SportsCar类的构造方法被调用了
//            CarBase类的构造方法被调用了
//Bus类的构造方法被调用了！
//        CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        ElectronicBus类的构造方法被调用了！
//        自建数组 b 的元素为：1
//        自建数组 b 的元素为：2
//        自建数组 b 的元素为：3
//        在SportsCar中定义的speedUp(int)方法被调用了。
//        CarBase类中定义的speedUp(int)方法被调用了
//        CarBase类中定义的speedUp(int)方法被调用了
//        在SportsCar中定义的speedUp(int)方法被调用了。
//        CarBase类中定义的speedUp(int)方法被调用了
//        CarBase类中定义的speedUp(int)方法被调用了
//        CarBase类中定义的speedUp(int)方法被调用了
//        CarBase类中定义的slowDown(int)方法被调用了。
//        CarBase类中定义的slowDown(int)方法被调用了。
//        CarBase类中定义的slowDown(int)方法被调用了。
//        Bus类中定义的slowDown(int)方法被调用了。
//        Bus类中定义的slowDown(int)方法被调用了。
