package com.javaeasy.car.logcar;

import com.javaeasy.car.Bus;
import com.javaeasy.car.CarBase;
import com.javaeasy.car.SportsCar;

public class LogCarOnAStreet {
    public static void main(String[] args){
        CarBase car = null;     //创建一个CarBase类的引用
        car = new CarBase("红色",90,"上海大巴",0);
        car.speedUp(50);
        TransportRecorder.recordTransport(car);
        car = new Bus("黄色",80,"大桥六线",0,0,0);
        car.speedUp(60);
        TransportRecorder.recordTransport(car);
        car = new SportsCar("黄色",100,"Eclipse",0,0);
        car.speedUp(70);
        TransportRecorder.recordTransport(car);
    }
}
