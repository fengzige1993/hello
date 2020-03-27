package com.javaeasy.override;

/**
 * 这里是是SportsCar类的对象调用方法
 * speedUp方法在类中有覆盖，所以java平台首先会执行SportsCar类中覆盖的方法
 * String className = this.getClass().getName();
 * this 自引用指向的是一个实例对象，得到调用方法的对象所属的类（全限定名）
 *
 */
public class WhichMethod {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        bus.speedUp(90);
        System.out.println("bus的速度为："+bus.speed);
        System.out.println("sportsCar开始followUp参数bus");
        //SportsCar类的对象调用方法
        sportsCar.followSpeed(bus);
        System.out.println("followUp结束");
        System.out.println("sportsCar的速度为："+sportsCar.speed);
    }
}

//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        CarBase类中定义的speedUp(int)方法被调用了
//        bus的速度为：90
//        sportsCar开始followUp参数bus
//        调用者的类型为com.javaeasy.override.SportsCar //1
//        在SportsCar中定义的speedUp(int)方法被调用了。
//        CarBase类中定义的speedUp(int)方法被调用了
//        followUp结束
//        sportsCar的速度为：90

//1
//可以看出是SportsCar类的对象调用了followSpeed()方法