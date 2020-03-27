package com.javaeasy.usemulticlass;

public class SportsCar {
    public int speed;
    public String name;
    public String color;
    public int nAmount = 90;

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

    public void speedUpUsingN(int p_amout){
        int realAmount = 0;
        if (nAmount <= p_amout){
            realAmount = nAmount;
            nAmount = 0;
        } else{
            realAmount = p_amout;
        }
        int speedUp = (int)(realAmount * 0.25);
        speed += speedUp;
    }

    public void addN(int p_amout){
        if (p_amout < 0){  //如果小于0，就返回为null,什么都不做
            return;
        }
        nAmount += p_amout;  //否则就让氮气增加相应的数量
    }
}
