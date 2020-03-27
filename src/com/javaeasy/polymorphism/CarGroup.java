package com.javaeasy.polymorphism;

import com.javaeasy.override.CarBase;

public class CarGroup {
    public CarBase leadingCar;
    public CarBase[] followingCars;

    public CarGroup(CarBase leadingCar, CarBase[] followingCars){
        this.leadingCar = leadingCar;
        this.followingCars = followingCars;

    }
    // 车队的加速方法，首先让领队车加速，然后让其余车跟进
    public void speedUp(int p_speed){
        leadingCar.speedUp(p_speed);
        for (int i = 0; i < followingCars.length; i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
    //车队的减速方法，首先让领队车减速，然后让其余的车减速
    public void slowDown(int p_speed){
        leadingCar.slowDown(p_speed);
        for (int i = 0; i < followingCars.length; i++){
            followingCars[i].followSpeed(leadingCar);
        }
    }
}
