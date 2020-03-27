package com.javaeasy.override;

/**
 * 使用super关键字操作父类的属性和方法
 * 使用this关键字操作子类的属性和方法
 */
public class UseSuperMethod {
    public static void main(String[] args){
        SportsCar car = new SportsCar();
        car.speedUp(70);
        System.out.println("cAr的speed属性值为："+car.speed);

    }
}
//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//    在SportsCar中定义的slowUp(int)方法被调用了。
//        CarBase类中定义的speedUp(int)方法被调用了
//        cAr的speed属性值为：70
