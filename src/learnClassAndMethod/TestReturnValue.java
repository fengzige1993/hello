package learnClassAndMethod;

public class TestReturnValue {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.raiseSpeed(70);     //给参数赋值，这是直接调用 Car类里的 raiseSpeed()方法并传输参数，in speed默认初始值是0
        System.out.println(myCar.speed);
        boolean isOverspeed = myCar.isOverspeed();
        if (isOverspeed){
            System.out.println("汽车超速行驶中1");
        } else {
            System.out.println("汽车没有超速1");
        }
        myCar.raiseSpeed(70);     //二次给参数赋值时，speed赋值为70
        isOverspeed = myCar.isOverspeed();
        if (isOverspeed){
            System.out.println("汽车超速行驶中2");
        } else {
            System.out.println("汽车没有超速2");
        }
    }
}

//        70
//        汽车没有超速1
//        汽车超速行驶中2