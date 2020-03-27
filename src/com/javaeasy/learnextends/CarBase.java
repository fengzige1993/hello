package com.javaeasy.learnextends;

/**
 * 汽车的公共类，公共的属性和方法
 */
public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;

    public CarBase(){
        System.out.println("CarBase类的构造方法被调用了");
    }

    public CarBase(String color,int maxSpeed,String name, int speed){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.speed = speed;
        System.out.println("CarBase类的有参数构造方法被调用了!");
    }

    public void speedUp(int p_speed){
        int tempSpeed = 0;
        if (p_speed > 0);{
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= maxSpeed){
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
