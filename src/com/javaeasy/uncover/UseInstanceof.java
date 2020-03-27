package com.javaeasy.uncover;

import com.javaeasy.override.Bus;
import com.javaeasy.override.CarBase;
import com.javaeasy.override.ElectronicBus;
import com.javaeasy.override.SportsCar;

public class UseInstanceof {
    public static void main(String[] args){
        ElectronicBus eBus = new ElectronicBus();
        CarBase base = eBus;
        if (base instanceof Object){
            //使用instanceof 关键字判断base指向的是不是object类的实例
            System.out.println("base指向的对象是Object类的一个对象");
        } else {
            System.out.println("base指向的对象不是Object类的一个对象");
        }
        if (base instanceof CarBase){
            System.out.println("base指向的对象是CarBase类的一个对象");
        } else {
            System.out.println("base指向的不是CarBase类的一个对象");
        }
        if (base instanceof Bus){
            System.out.println("base指向的对象是Bus类的一个对象");
        } else {
            System.out.println("base指向的对象不是Bus类的一个对象");
        }
        if (base instanceof ElectronicBus){
            System.out.println("base指向的对象是ElectronicBus类的一个对象");
        } else {
            System.out.println("base指向的对象不是ElectronicBus类的一个对象");
        }
        if (base instanceof SportsCar){
            System.out.println("base指向的对象是SportsCar类的一个对象");
        } else {
            System.out.println("base指向的对象不是SportsCar类的一个对象");
        }
    }

}

//CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        ElectronicBus类的构造方法被调用了！
//        base指向的对象是Object类的一个对象
//        base指向的对象是CarBase类的一个对象
//        base指向的对象是Bus类的一个对象
//        base指向的对象是ElectronicBus类的一个对象
//        base指向的对象不是SportsCar类的一个对象
