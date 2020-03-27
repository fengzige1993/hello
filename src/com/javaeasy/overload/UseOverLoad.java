package com.javaeasy.overload;

import com.javaeasy.override.Bus;
import com.javaeasy.override.CarBase;
import com.javaeasy.override.ElectronicBus;
import com.javaeasy.override.SportsCar;
//import learnClassAndMethod.Car;

public class UseOverLoad {
    public static void main(String[] args){
        UseCar useCar = new UseCar();
        CarBase base = new CarBase();
        SportsCar sports = new SportsCar();
        Bus bus = new Bus();
        ElectronicBus eBus = new ElectronicBus();

        System.out.println("使用CarBase类的对象做参数调用UseCar类的setCar()方法：");
        useCar.setCar(base);
        System.out.println("使用SportsCar类的对象做参数调用UseCar类的setCar()方法：");
        useCar.setCar(sports);
        System.out.println("使用Bus类的对象做参数调用UseCar类的setCar()方法：");
        useCar.setCar(bus);
        System.out.println("使用ElectronicBus类的对象做参数调用UseCar类的setCar()方法：");
        useCar.setCar(eBus);
    }
}
