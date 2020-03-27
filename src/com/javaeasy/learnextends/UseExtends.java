package com.javaeasy.learnextends;

public class UseExtends {
    public static void main(String[] args){
        Bus bus = new Bus();
        System.out.println("9位乘客登上了公交车");
        bus.getOnBus(9);
        System.out.println("公交车出发");
        bus.speedUp(50);
        System.out.println("公交车的当前速度为："+bus.speed);
        System.out.println("公交车的当前乘客为"+bus.current_Passenger);

        System.out.println("到站停车");
        bus.slowDown(50);
        System.out.println("5位乘客下了公交车");
        bus.getDownBus(5);
        System.out.println("公交车的当前速度为："+bus.speed);
        System.out.println("公交车的当前乘客为："+bus.current_Passenger);
        System.out.println("公交车出发");
        bus.speedUp(70);
        bus.slowDown(70);
        System.out.println("4位乘客下了公交车");
        bus.getDownBus(4);
        System.out.println("公交车当前速度为："+bus.speed);
        System.out.println("公交车当前乘客为："+bus.current_Passenger);

    }
}
