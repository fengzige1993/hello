package com.javaeasy.transport;

import com.javaeasy.car.CarBase;

public class SportsCar extends CarBase {
    public int nAmount = 90;
    public int autoUsingN = 5;
    public SportsCar(){
        System.out.println("SportsCar类的构造方法被调用了");
    }

    public SportsCar(String color, int maxSpeed, String name, int speed, int amount){
        super(color, maxSpeed, name, speed);
        nAmount = amount;
        System.out.println("SportsCar类有参数的构造方法被调用了！");
    }

    public void speedUp(int p_speed){
        System.out.println("在SportsCar中定义的speedUp(int)方法被调用了。");
//        int tempSpeed = 0;
//        if (p_speed > 0){
//            tempSpeed = speed + p_speed;
//        }
//        if (tempSpeed <= maxSpeed){
//            speed = tempSpeed;
//        }
        super.speedUp(p_speed);
        // 使用super关键字操作父类的属性和方法
        // 使用this关键字操作本类的属性和方法
        if (nAmount >= autoUsingN){
            nAmount -= autoUsingN;
        } else {
            nAmount = 0;
        }
    }

    public void speedUpUsingN(int p_amount){
        int realAmount = 0;
        if (nAmount <= p_amount){
            realAmount = nAmount;
            nAmount = 0;
        } else {
            realAmount = p_amount;
            nAmount -= p_amount;
        }

        int speedUp = (int)(realAmount * 0.25);
        speed += speedUp;
    }

    public void addN(int p_amout){
        if (p_amout < 0){
            return;
        }
        nAmount += p_amout;
    }

}
