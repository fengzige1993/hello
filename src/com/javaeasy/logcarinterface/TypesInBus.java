package com.javaeasy.logcarinterface;

import com.javaeasy.transport.Bus;
import com.javaeasy.transport.CarBase;
import learnClassAndMethod.Car;

public class TypesInBus {
    public static void main(String[] args){
        Bus bus = new  Bus(){
            @Override
            public TransportStatusForLog getTransportsStatus() {
                return null;
            }
        };
        if (bus instanceof Bus){
            System.out.println("bus指向的对象是一个Bus类型的实例");
        } else {
            System.out.println("bus指向的对象不是一个Bus类的实例");
        }
        if (bus instanceof CarBase){
            System.out.println("bus指向的对象是一个CarBase类型的实例");
            System.out.println("使用bus给CarBase类的引用赋值");
            CarBase base = bus;
        } else {
            System.out.println("bus指向的对象不是一个CarBase类型的实例");
        }
        if (bus instanceof Object){
            System.out.println("bus指向的对象是一个Object类型的实例");
            System.out.println("使用bus给Object类的引用赋值");
            Object obj = bus;
        } else {
            System.out.println("bus指向的对象不是一个Object类型的实例");
        }
    }
}
