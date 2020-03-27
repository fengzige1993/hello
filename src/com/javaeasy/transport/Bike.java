package com.javaeasy.transport;
/**
 * 接口的实现使用 implements 关键字，一个类名可以有多个接口的实现，
 * 可以在 implements后面加多个逗号实现
 * java语法规定：当一个类通过implements关键字声明实现一个接口的同时
 * 类中必须提供接口中规定的所有抽象方法的具体实现
 * 一个接口可以有无数个实现
 */

import com.javaeasy.logcarinterface.TransportStatusForLog;
import com.javaeasy.logcar.TransportStatus;
import com.javaeasy.logcarinterface.RecordeAble;  // 引入使用到的接口

//使用implements语句实现RecordeAble接口
public  class Bike implements  RecordeAble {
    /**
     * 这里 Bike类必须声明一个或者实现一个在接口RecordeAble 中的抽象方法
     */
//  Class 'Bike' must either be declared abstract or implement abstract 'getTransportsStatus()'in 'RecordeAble'
    private int speed;
    private String name;
    //实现接口中规定的方法，（1）错误的演示
    public TransportStatusForLog getTransportStatus(){
        TransportStatusForLog status = new TransportStatusForLog(name, speed);
        return status;
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
    //实现RecordeAble接口中规定的方法 (2) 正确的操作 Alt + Enter
    // 创建一个 TransportStatusForLog的引用status ,并让它指向一个TransportsStatusForLog对象
    @Override
    public TransportStatusForLog getTransportsStatus() {
        TransportStatusForLog status = new TransportStatusForLog(name,speed);
        return status;
    }
}

