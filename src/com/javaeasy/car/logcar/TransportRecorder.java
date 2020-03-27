package com.javaeasy.car.logcar;

/**
 * Create by feng.hu on 2019/7/25
 * 接口—1 没有了继承 recordTransport()方法变得十分臃肿
 */

        import com.javaeasy.car.CarBase;
        import com.javaeasy.logcarinterface.TransportStatusForLog;
        import com.javaeasy.othertransport.Bike;
        import com.javaeasy.logcar.TransportStatus;

//记录汽车信息的类
public class TransportRecorder {
    public static int counter = 0; //静态变量用于保存经过的汽车数
    public static void recordTransport(Object transportObj){//静态方法用于处理一辆经过的汽车
        if (transportObj == null){   //如果Car的值是null
            return;         //则方法结束，不做任何处理
        } else{         //否则
            counter ++;    //汽车计数器加 1
            TransportStatusForLog status = null; // 创建TransportStatus 类的引用，可以先为null
            if (transportObj instanceof CarBase){ //使用instanceof 判断 transportObj引用指向的是不是CarBase对象
                CarBase car = (CarBase)transportObj; //如果是则强制类型转换为CarBase类型的引用（高精度向低精度转换-强制类型转换）
                status = car.getCarStatus(); //调用getCarStatus()方法得到汽车的状态
            } else if (transportObj instanceof Bike){
                Bike bike = (Bike)transportObj;
                status = bike.getBikeStatus();
            } else { //如果都不是++++++++
                return; //就结束方法
            }
            System.out.println("以下是经过的第"+counter+"车辆的信息是：");
            System.out.println("交通工具的名字为："+status.getName()+",车速为："+status.getSpeed());
        }
    }
}
