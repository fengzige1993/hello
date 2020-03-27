package learnClassAndMethod;

public class TestManyMethod {
    public static void main(String[] args) {
        //一辆普通的车
        Car normalCar = new Car("普通车", "白色");
        normalCar.setSpeedAndDirection(55, "菜市场");
        normalCar.printCarRunningMessage();

        //一辆的疯狂的赛车
        Car crazyCar = new Car("疯狂的赛车", "黑色");
        crazyCar.setSpeedAndDirection(35, "赛车场");
        crazyCar.printCarRunningMessage();
        crazyCar.overtakeCar(normalCar); // 调用方法超车
        crazyCar.printCarRunningMessage(); //打印现在车的信息
        crazyCar.raiseSpeed((byte)55);     //用byte 类型为参数，增加速度
        crazyCar.printCarRunningMessage(); // 打印车的信息
        crazyCar.raiseSpeed(55);  //再用int 参数，增加速度

        //增加交通管理员，创建一个交通管理员，一个引用为 trafficAdmin的对象
        Car trafficAdmin = new Car("汽车管理员","红色",true);
        trafficAdmin.setSpeedAndDirection(55,"交通管理中心");

        //获取normalCar车的状态，在这里用一个引用为trafficAdmin的对象去调用方法
        CarStatus normalStatus = trafficAdmin.getAnotherCarStatus(normalCar);  //获取normalCar车辆状态赋值给CarStatus类型的normalStatus变量
        boolean isLegal = trafficAdmin.isLegalCarStatus(normalStatus); //把返回的boolean变量赋值给 isLegal变量

        //判断normalStatus的boolean返回值,如果值为true,就是合法的并更改车的名字
        if (isLegal){
            trafficAdmin.setNameForAndtherCar(normalCar,"驾车典范");
        }
        normalCar.printCarRunningMessage();

        //获取疯狂赛车的状态
        CarStatus crazyStatus = trafficAdmin.getAnotherCarStatus(crazyCar);
        isLegal = trafficAdmin.isLegalCarStatus(crazyStatus);

        //carzyCar试图调用方法让 trafficAdmin停下
        crazyCar.stopAontherCar(trafficAdmin);
        crazyCar.getAnotherCarStatus(trafficAdmin);

        //否false 就是true,所有里面的条件 isLegal就是false
        if (!isLegal){
            trafficAdmin.setNameForAndtherCar(crazyCar,"疯狂超速车");
            trafficAdmin.stopAontherCar(crazyCar);
            crazyCar.printCarRunningMessage();
        }

        //速度清零，到达目的地
        normalCar.setSpeed(0);
        normalCar.printCarRunningMessage();
    }
}

//        车名为"普通车"的汽车行驶速度为:"55"，汽车的行驶方向为："菜市场"
//        车名为"疯狂的赛车"的汽车行驶速度为:"35"，汽车的行驶方向为："赛车场"
//        车名为"疯狂的赛车"的汽车行驶速度为:"60"，汽车的行驶方向为："菜市场"
//        车名为"疯狂的赛车"的汽车行驶速度为:"115"，汽车的行驶方向为："菜市场"
//        车名为"驾车典范"的汽车行驶速度为:"55"，汽车的行驶方向为："菜市场"
//        你不是交通管理员，无权调用此方法！
//        你不是交通管理员，无权调用此方法
//        车名为"疯狂超速车"的汽车行驶速度为:"0"，汽车的行驶方向为："菜市场"
//        车名为"驾车典范"的汽车行驶速度为:"0"，汽车的行驶方向为："菜市场