package learnClassAndMethod;

public class TestParameterVerify {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.raiseSpeed(55);
        System.out.println("汽车现在的速度是："+myCar.speed);
        myCar.raiseSpeed(-3);
        System.out.println("汽车现在的速度是："+myCar.speed);
    }
}
