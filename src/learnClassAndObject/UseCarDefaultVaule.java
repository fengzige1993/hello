package learnClassAndObject;

public class UseCarDefaultVaule {
    public static void main(String[] args){
        Car carDefault;
        carDefault = new Car();
        System.out.println("汽车的默认速度为："+carDefault.speed);
        System.out.println("它的默认的颜色是："+carDefault.color);
        System.out.println("汽车默认的名字为："+carDefault.name);
        System.out.println("汽车默认的行驶方向为："+carDefault.direction);
    }
}
