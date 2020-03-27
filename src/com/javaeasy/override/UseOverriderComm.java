package com.javaeasy.override;

/**
 * Create by feng.hu on 2019/7/10.
 * 父类的引用指向子类的对象，然后调用相应的属性和方法。
 * 当调用相同的方法时，Java平台会优先执行子类中的方法。如果找不到，就会去它的父类中寻找符合方法签名的方法
 * 如果再找不到，则去它父类的父类中寻找符合方法签名的方法，一直到找到为止。
 */
public class UseOverriderComm {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        CarBase base = sportsCar;
        System.out.println("===================汽车开始加速=====================");
        System.out.println("加速前汽车的速度为："+sportsCar.speed+",剩余的氮气为："+sportsCar.nAmount);

        base.speedUp(50);
        System.out.println("加速后汽车的速度为："+sportsCar.speed+",剩余氮气为："+sportsCar.nAmount);
        System.out.println("=====================汽车加速完毕====================");
    }
}
//可以看到在父类的引用指向子类的对象时， java确实调用了SportsCar类中的speedUp()方法。----- 指向谁。执行谁
//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//===================汽车开始加速=====================
//        加速前汽车的速度为：0,剩余的氮气为：90
//        CarBase类中定义的slowUp(int)方法被调用了。
//        加速后汽车的速度为：50,剩余氮气为：85
//        =====================汽车加速完毕====================

//覆盖语法的严格定义：
//1.首先，子类必须把这个方法从父类中继承过来
//2.子类的一个方法的签名与继承自父类的某个方法的签名相同时，则java语法要求：
//子类中的这个方法的访问控制符赋予方法的访问权限必须于父类中那个方法的访问权限相同或更宽松
//3.子类的一个方法的签名与继承自父类的某个方法的签名相同时，则java语法要求：
//子类中的方法的返回值类型必须能够赋值给父类方法的返回值类型。可以理解为可以从低精度向高精度赋值。