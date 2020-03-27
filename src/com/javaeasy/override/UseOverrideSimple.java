package com.javaeasy.override;

/**
 * 子类覆盖父类的方法
 */
public class UseOverrideSimple {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        System.out.println("====================跑车开始加速========================");
        System.out.println("加速前跑车的速度为："+sportsCar.speed+",剩余的氮气为："+sportsCar.nAmount);
        sportsCar.speedUp(50);
        System.out.println("加速后跑车的速度为："+sportsCar.speed+",剩余氮气为："+sportsCar.nAmount);
        System.out.println("===================跑车加速完毕========================");
    }
}

//            CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//====================跑车开始加速========================
//        加速前跑车的速度为：0,剩余的氮气为：90
//        CarBase类中定义的slowUp(int)方法被调用了。
//        加速后跑车的速度为：50,剩余氮气为：85
//        ===================跑车加速完毕========================
//可以看到创建对象的时候调用了父类默认的无参的构造方法
//SportsCar调用 speedUp（）方法时覆盖了父类相同的构造方法，调用了自己的speedUp方法