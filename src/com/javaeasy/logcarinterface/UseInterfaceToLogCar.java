package com.javaeasy.logcarinterface;

import com.javaeasy.car.logcar.TransportRecorder;
import com.javaeasy.transport.Bike;
import com.javaeasy.transport.Bus;
import com.javaeasy.transport.CarBase;

public class UseInterfaceToLogCar {
    public static void main(String[] args){
        //创建一个CarBase类的引用,并让car指向一个CarBase类的对象
        CarBase car = new CarBase("红色",80,"上海大发",0);
        car.speedUp(50);
        TransportRecorderForLog.recordTransport(car);  //得到CarBase类对象的状态

        //创建一个Bus类的引用bus,并让bus指向一个bus类的对象
        Bus bus = new Bus("黄色",80,"大桥六线",0,0,0);
        bus.speedUp(60);
        TransportRecorderForLog.recordTransport(bus);  //记录Bus类对象的状态

        //创建一个Bike类的引用bike,并让bike指向一个Bike类对象
        Bike bike = new Bike();
        bike.setName("自行车一辆");
        bike.setSpeed(10);
        TransportRecorderForLog.recordTransport(bike);  //记录Bike类对象的状态
    }

}

// 运行结果如下：
//CarBase类的有参数构造方法被调用了!
//        CarBase类中定义的speedUp(int)方法被调用了
//        以下是经过的第1交通工具的信息是：
//        交通工具的名字为：上海大发,车速为：50
//        CarBase类的有参数构造方法被调用了!
//        Bus类有参数的构造方法被调用了
//        CarBase类中定义的speedUp(int)方法被调用了
//        以下是经过的第2交通工具的信息是：
//        交通工具的名字为：大桥六线,车速为：60
//        以下是经过的第3交通工具的信息是：
//        交通工具的名字为：自行车一辆,车速为：10