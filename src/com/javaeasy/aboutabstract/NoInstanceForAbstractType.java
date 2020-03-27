package com.javaeasy.aboutabstract;

import com.javaeasy.logcarinterface.RecordeAble;
import com.javaeasy.transport.Bike;
import com.javaeasy.transport.CarBase;

public class NoInstanceForAbstractType {
    public static void main(String args[]){
//        RecordeAble noInstance = new RecordeAble();
        //RecordeAble 是抽象的不能被实例化
        RecordeAble instancel = null;
        /**
         * 创建一个接口的引用，让RecordeAble 引用指向Bike类对象
         * 因为Bike类实现了RecordeAble接口，所以赋值是正确的
         */
        instancel = new Bike(); // 通过接口的引用调用接口中定义的方法
        /**
         * 让接口指向CarBase类的对象，CarBase类实现了RecordAble接口
         * 所以赋值是正确的
         */
        RecordeAble instance2 = new CarBase();  //通过接口的引用调用接口中定义的方法
    }
}
