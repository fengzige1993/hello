package com.javaeasy.othertransport;

import com.javaeasy.logcar.TransportStatus;
import com.javaeasy.logcarinterface.TransportStatusForLog;

public class Bike {
    private int speed;
    private String name;

    public TransportStatusForLog getBikeStatus(){
        TransportStatusForLog TransportStatus = new TransportStatusForLog(name, speed);
        return TransportStatus;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        if (speed < 0){
            return;
        } else{
            this.speed = speed;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name == null){
            return;
        } else{
            this.name = name;
        }
    }
}
