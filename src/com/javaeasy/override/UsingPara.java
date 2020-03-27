package com.javaeasy.override;

/**
 * 方法的实参兼容方法的形参
 * 使用SportsCar类的引用作为参数传递给followUp()方法
 * 使用sportsCar作为参数其实就是sportsCar给CarBase类的引用赋值。
 * 这里是bus类的对象调用speedUp方法，这里继承了父类的 speedUp方法
 */
public class UsingPara {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(90);
        System.out.println("SportsCar的速度为："+sportsCar.speed);
        bus.followSpeed(sportsCar);
        System.out.println("bus的速度为："+bus.speed);
    }
}

//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        在SportsCar中定义的slowUp(int)方法被调用了。
//        SportsCar的速度为：90
//        CarBase类中定义的speedUp(int)方法被调用了
//        bus的速度为：90

