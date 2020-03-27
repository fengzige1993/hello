package com.javaeasy.logcarinterface;

/**
 * Create by feng.hu on 2019/7/25
 * 接口—1 没有了继承 recordTransport()方法变得十分臃肿
 */

import com.javaeasy.transport.CarBase;
import com.javaeasy.logcar.TransportStatus;
import com.javaeasy.othertransport.Bike;

//记录汽车信息的类
public class TransportRecorderForLog {
    public static int counter = 0; //静态变量用于保存经过的汽车数

    //方法的参数类型是 RecordeAble类型
    public static void recordTransport(RecordeAble recordeAble){//静态方法用于处理一辆经过的汽车
        if (recordeAble == null){   //如果Car的值是null
            return;         //则方法结束，不做任何处理
        } else{         //否则
            counter ++;    //汽车计数器加 1
            //通过RecordeAble接口的引用recordeAble,调用getTransportStatus()方法来得到TransportStatusForLog类的对象
            //这样就可以调用里面的方法，得到汽车的状态属性信息（getName(),getSpeed()...）这
            TransportStatusForLog status = recordeAble.getTransportsStatus();
//            if (recordeAble instanceof CarBase){
//                CarBase car = (CarBase)recordeAble; //如果是则强制类型转换为CarBase类型的引用（高精度向低精度转换-强制类型转换）
//                status = car.getCarStatus(); //调用getCarStatus()方法得到汽车的状态
//            } else if (recordeAble instanceof Bike){
//                Bike bike = (Bike)recordeAble;
//                status = bike.getBikeStatus();
//            } else { //如果都不是
//                return; //就结束方法
//            }
            System.out.println("以下是经过的第"+counter+"交通工具的信息是：");
            System.out.println("交通工具的名字为："+status.getName()+",车速为："+status.getSpeed());
        }
    }
}
