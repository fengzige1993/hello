package com.javaeasy.accessvariable;

/**
 * 这种 private变量 + 方法 的模式灵活多变，在很多的时候都应该采用这种模式
 * 为了避免外部直接操作成员变量的值，在没有特殊需要的情况下，我们应该尽量使用private访问控制符修饰成员变量
 * 根据程序的需要提供get XXX 和 setXXX 方法。在 get XXX 和 setXXX 方法中检查变量的新值，根据结果进行
 * 相应的操作
 *
 */
public class CarBase {
    private int speed; //实例变量speed,用来表示汽车的速度
    private static int MAX_SPEED = 90;  //静态变量MAX_SPEED,用来表示最大速度

    //为speed属性准备的方法，返回speed属性的值
    public int getSpeed(){
        return speed;
    }
    //为speed属性准备的方法，允许修改speed属性的值
    public void setSpeed(int speed){
        if (speed < 0 || speed > MAX_SPEED){ //如果新的速度小于0，或者大于MAX_SPEED
            return;     //则不允许修改speed属性的值
        }
        this.speed = speed; //否则就修改speed属性的值
    }
    //为MAX_SPEED属性准备的方法，返回MAX_SPEED属性的值
    public static int getMaxSpeed(){
        return MAX_SPEED;
    }
    //为MAX_SPEED属性准备的方法，允许修改MAX_SPEED属性的值
    public static void setMaxSpeed(int maxSpeed){
        if (maxSpeed < 0){      //如果新的最大限制速度小于0
            return;  //则不允许修改MAX_SPEED的值
        }
        MAX_SPEED = maxSpeed;   //否则就修改MAX_SPEED的值
    }
    public void speedUp(int p_speed){//加速方法
        int tempSpeed = 0;
        if (p_speed > 0){
            tempSpeed = speed  + p_speed;
        }

        if (tempSpeed <= MAX_SPEED){
            speed = tempSpeed;
        }
    }

    public void slowDown(int p_speed){
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }

}
