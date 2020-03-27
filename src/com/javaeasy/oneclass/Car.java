package com.javaeasy.oneclass;

public class Car {
    public int speed;
    public String name;
    public String color;
    public boolean isBus;
    public int max_Passenger = 35; //最大乘客数
    public int current_Passenger = 0; //当前乘客数
    //给汽车加速
    public void speedUp(int p_speed){
        if (p_speed > 0){
            speed += p_speed;
        }
    }
    //给汽车减速
    public void slowDown(int p_speed){
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }

    //为公共汽车增加方法,完成上车功能
    public boolean getOnBus(int p_amount){
        if (isBus){
            int temp = current_Passenger + p_amount;
            if(temp > max_Passenger){
                return false;
            } else {
                current_Passenger = temp;
                return true;
            }
        }
        return false;
    }
    //完成公共汽车下车的功能-
    public boolean getDownBus(int p_amount){
        if (isBus){
            int temp = current_Passenger - p_amount;
            if (temp < 0){
                return false;
            } else {
                current_Passenger = temp;
                return true;
            }
        }
        return false;
    }
}
