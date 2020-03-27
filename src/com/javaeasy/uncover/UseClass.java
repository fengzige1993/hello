package com.javaeasy.uncover;
/**
 * Create by feng.hu on 2019/7/15
 * Class 类是java.lang包中的类，它是Java语言中的基础类。Class类的功能强大
 * 包含一个类的所有信息，即类名、属性、方法、父类等
 *Class类中的getName()方法会返回一个String类的对象，内容是Class类所表示的全限定名
 * Object类中提供了一个叫做getClass()的方法。来获取这个Class对象
 *
 */

import com.javaeasy.override.CarBase;
import com.javaeasy.override.SportsCar;

public class UseClass {
    public static void main(String[] args){
        //创建一个SportsCar类的对象，用base指向这个对象
        CarBase base = new SportsCar();
        //调用getClass()方法，得到其Class类的对象
        Class clazz = base.getClass();
        //得到这个Class类对象的全限定明，也就是得到这个对象所属类的Class类对象的全限定名
        System.out.println("base引用指向的对象所属的类是："+clazz.getName());
    }
}

//    CarBase类的构造方法被调用了
//            SportsCar类的构造方法被调用了
//base引用指向的对象所属的类是：com.javaeasy.override.SportsCar

