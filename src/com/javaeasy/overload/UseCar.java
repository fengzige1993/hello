package com.javaeasy.overload;
/**
 * 当继承被引入到重载的参数中时，决定函数重载的哪个方法被调用的是实参
 * 这里的实参值的是引用的类型
 */

import com.javaeasy.override.CarBase;
import com.javaeasy.override.ElectronicBus;

public class UseCar {
    public CarBase car;
    public ElectronicBus bus;
    //有两个setCar的构造方法是重载关系，他们的形式参数有继承关系
    //哪个重载的方法被调用取决于实参的引用类型
    public void setCar(CarBase car){
        System.out.println("setCar(CarBase)方法被调用了");
        this.car = car;
    }

    public void setCar(ElectronicBus bus){
        System.out.println("setCar(ElectronicBus)方法被调用了");
        this.bus = bus;
    }
}
