package learnClassAndMethod;

public class TestCar {
    public static void main(String[] args){
        Car myCar = new Car();   // 创建一个Car对象
        myCar.driveCar();     //通过myCar调用driverCar()的方法
        System.out.println("现在的车速为："+myCar.speed);
        System.out.println("行驶的方向为："+myCar.direction);
    }
}

