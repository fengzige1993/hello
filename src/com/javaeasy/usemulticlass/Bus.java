package com.javaeasy.usemulticlass;

/**
 * create by Feng.Hu on 2019/7/6
 * 继承和多太——继承
 */
public class Bus {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;
    public int max_Passenger = 35;
    public int current_Passenger = 0;

    public void speedUp(int p_speed){
        int tempSpeed = 0;
        if (p_speed > 0){
            speed += p_speed;
        }
        if (tempSpeed <= maxSpeed){
            speed = tempSpeed;
        } else {
            speed = maxSpeed;
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

    public boolean getOnBus(int p_amout){
        int temp = current_Passenger + p_amout;
        if (temp > max_Passenger){
            return false;
        } else{
            current_Passenger = temp;
            return true;
        }
    }

    public boolean getDownBus(int p_amout){
        int temp = current_Passenger - p_amout;
        if (temp < 0){
            return false;
        } else{
            current_Passenger = temp;
            return true;
        }
    }

}
