package com.javaeasy.staticmethod;

/**
 * 非静态方法是可以访问类中定义的实例变量
 * 非静态方法是通过指向对象的应用调用的
 * 静态方法是通过类名调用的,它无法操作类中某一个对象的实例变量
 *所以静态方法只能访问静态变量和静态方法
 * 所以静态变量和静态方法又被称为类方法和类变量
 */
public class SimpleCar {
    public static int MAX_SPEED = 90;
    //静态变量，用来保存速度限制值
    public int speed = 0;
    //实例变量，用来保存SimpleCar对象的速度

    public void setSpeed(int p_speed){//非静态方法
        if (p_speed < MAX_SPEED){
            this.speed = p_speed;
        } else{
            this.speed = MAX_SPEED;
        }
    }

    public static void setMaxSpeed(int maxSpeed){
        MAX_SPEED = maxSpeed;
    }
}
