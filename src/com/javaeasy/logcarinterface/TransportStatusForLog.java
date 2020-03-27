package com.javaeasy.logcarinterface;

public class TransportStatusForLog {//用来记录经过汽车的属性信息，包括name和speed
    private String name;
    private int speed;

    public TransportStatusForLog(String name, int speed){
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
