package learnClassAndMethod;

public class TestMultiParameters {
    public static void main(String[] args){
        Car myCar = new Car();
        int nextSpeed = 155;
        myCar.setSpeedAndDirection(nextSpeed,"东方");
        System.out.println("现在的车数为："+myCar.speed+"，行驶的方向为："+myCar.direction);
    }
}
