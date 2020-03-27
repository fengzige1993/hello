package com.javaeasy.usemulticlass;

public class Car {
    public int speed;
    public String name;
    public String color;

    public void speedUp(int p_speed){
        if (p_speed > 0){
            speed += p_speed;
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
