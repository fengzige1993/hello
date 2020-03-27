package com.javaeasy.logcar;

public class TransportStatus {//用来记录经过汽车的属性信息，包括name和speed
    private String name;
    private int speed;

    public TransportStatus(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }
}
