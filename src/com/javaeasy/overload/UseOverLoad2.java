package com.javaeasy.overload;

import com.javaeasy.override.Bus;
import com.javaeasy.override.CarBase;
import com.javaeasy.override.ElectronicBus;
import com.javaeasy.override.SportsCar;

public class UseOverLoad2 {
    public static void main(String[] args){
        UseCar useCar = new UseCar();
        CarBase base = new CarBase();
        System.out.println("使用CarBase类的对象做参数调用UseCar类的setCar()方法：");
        useCar.setCar(base);
        System.out.println("使用SportsCar类的对象做参数调用UseCar类的setCar()方法：");
        base = new SportsCar();
        useCar.setCar(base);
        System.out.println("使用Bus类的对象做参数调用UseCar类的setCar()方法：");
        base = new Bus();
        useCar.setCar(base);
        System.out.println("使用ElectronicBus类的对象做参数调用UseCar类的set.Car()方法：");
        base = new ElectronicBus();
        useCar.setCar(base);

    }
}
//
//    CarBase类的构造方法被调用了
//    使用CarBase类的对象做参数调用UseCar类的setCar()方法：
//        setCar(CarBase)方法被调用了
//        使用SportsCar类的对象做参数调用UseCar类的setCar()方法：
//        CarBase类的构造方法被调用了
//        SportsCar类的构造方法被调用了
//        setCar(CarBase)方法被调用了
//        使用Bus类的对象做参数调用UseCar类的setCar()方法：
//        CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        setCar(CarBase)方法被调用了
//        使用ElectronicBus类的对象做参数调用UseCar类的set.Car()方法：
//        CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        ElectronicBus类的构造方法被调用了！
//        setCar(CarBase)方法被调用了
