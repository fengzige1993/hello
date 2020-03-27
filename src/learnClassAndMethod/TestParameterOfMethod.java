package learnClassAndMethod;

public class TestParameterOfMethod {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.driveCar();   //这里是先调用 Car类里的 driveCar()函数，所以speed是 50
        myCar.raiseSpeed(5);   //然后再给带参数的方法。赋值参数。5前面是Car类里定义的参数，赋值的时候是java平台自动生成的。
        System.out.println("现在车速为："+myCar.speed);
        System.out.println("行驶方向为："+myCar.direction);
        System.out.println("车的颜色是："+myCar.color);
        System.out.println("车的名称是："+myCar.name);
    }
}

//        现在车速为：55
//        行驶方向为：南方