package com.javaeasy.accessclass;

/**
 * 一个源文件中至少要有一个和源文件名相同的，使用public修饰的类
 * 除此之外可以包含0个或多个没有被public修饰的类
 * 这种非public关键字修饰的类全限定名也是“包名+类名”
 * ClassTwo是默认修饰符修饰的（没有修饰符）
 */
public class ClassOne {//使用public 修饰的类的类名必须和源文件名相同
    public int instanceVariable;
    public static int staticVariable;

    public void method(){
    }

    public static void staticMethod(){
    }
}

class ClassTwo{//其他类可以使用任意合法标识符作为类名，和源文件名无关

}
//他们都是泪的组成部分
//1.从 所属关系的角度出发：
//非静态变量：也称成员变量
//静态变量：也称为静态成员变量
//非静态方法：也称成员方法
//静态方法：也称为静态成员方法
//2.从作用范围的角度出发
//非静态变量：也称实例变量 ==== 实例对象不可以调用静态变量
//静态变量：也称类变量
//非静态方法：也称实例方法 ==== 实例对象不可以调用静态方法
//静态方法：也称为类方法