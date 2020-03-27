package com.javaeasy.override;

public class Bus extends CarBase {
    public int max_Passenger = 35;
    public int current_Passenger = 0;
    public int max_slow = 27;

    public Bus(){
        System.out.println("Bus类的构造方法被调用了！");
    }

    public void slowDown(int p_speed){
        System.out.println("Bus类中定义的slowDown(int)方法被调用了。");
        if (p_speed > max_slow){
            p_speed = max_slow;
        }
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }

    public Bus(String color, int maxSpeed, String name, int speed, int current_Passenger, int max_Passenger){
        super(color, maxSpeed, name, speed);
        this.current_Passenger = current_Passenger;
        this.max_Passenger = current_Passenger;
        this.max_Passenger = max_Passenger;
        System.out.println("Bus类有参数的构造方法被调用了");
    }

    public boolean getOnBus(int p_amount){
        int temp = current_Passenger + p_amount;
        if (temp > max_Passenger){
            return false;
        } else {
            current_Passenger = temp;
            return  true;
        }
    }

    public boolean getDownBus(int p_amount){
        int temp = current_Passenger - p_amount;
        if (temp < 0){
            return false;
        } else{
            current_Passenger = temp;
            return true;
        }
    }
}
