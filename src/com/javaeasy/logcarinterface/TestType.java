package com.javaeasy.logcarinterface;

/**
 * Create by feng.hu on 2019/07/30
 * 一个类实现了一个接口，就拥有了接口的类型
 * 继承可以让子类获得父类的各种成员（属性和方法），同样也让子类获得了父类的所有类型
 * 包括继承接口获得的类型
 */

import com.javaeasy.transport.Bus;
import com.javaeasy.transport.CarBase;


public class TestType {
    public static void main(String[] args){
        CarBase base = new CarBase() {
            @Override
            public TransportStatusForLog getTransportsStatus() {
                return null;
            }
        };

        Bus bus = new Bus(){
            @Override
            public TransportStatusForLog getTransportsStatus() {
                return null;
            }
        };
        //使用instance of 判断CarBase类型的引用所指向的对象是不是RecordeAble类型的实例
        if (base instanceof RecordeAble){
            System.out.println("base指向的对象是一个RecorderAble类型的实例");
            System.out.println("使用base给RecordeAble类的引用赋值");
            //使用base给RecordeAble的引用赋值
            RecordeAble recordeAble = base;
        } else {
            System.out.println("base指向的对象不是一个RecordeAble类型的实例");
        }
        //使用instanceof 判断Bus类的对象是不是RecordeAble类型的实例
        if (bus instanceof RecordeAble){
            System.out.println("bus指向的对象是一个RecordeAble类型的实例");
            System.out.println("使用bus给RecordeAble类的引用赋值");
            RecordeAble recordeAble = bus;
        } else {
            System.out.println("bus指向的对象不是一个RecordeAble类型的实例");
        }

    }
}
