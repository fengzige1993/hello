package com.javaeasy.override;

/**
 * 当子类的方法覆盖了父类的方法的方法时，除了完成特殊的功能之外，
 * 我们还应该保证子类的方法完成了父类中方法应该完成的功能
 * 覆盖的多态性，造就了覆盖的潘多拉魔盒
 */
public class FirstBug {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(30);
        bus.speedUp(70);
        System.out.println("bus的速度为："+bus.speed);
        System.out.println("sportsCar的速度为："+sportsCar.speed);

        //子类覆盖了父类的方法时，却没有完成被覆盖的方法应该完成的事情
        System.out.println("bus开始followUp参数sportsCar");
        bus.followSpeed(sportsCar);
        System.out.println("followUp结束");
        System.out.println("bus的速度为："+bus.speed);
        System.out.println("sportsCar的速度为："+sportsCar.speed);

    }
}
//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//CarBase类的构造方法被调用了
//        Bus类的构造方法被调用了！
//        在SportsCar中定义的slowUp(int)方法被调用了。
//        CarBase类中定义的speedUp(int)方法被调用了
//        CarBase类中定义的speedUp(int)方法被调用了
//        bus的速度为：70
//        sportsCar的速度为：30
//        bus开始followUp参数sportsCar
//        Bus类中定义的slowDown(int)方法被调用了。
//        followUp结束
//        bus的速度为：43
//        sportsCar的速度为：30
