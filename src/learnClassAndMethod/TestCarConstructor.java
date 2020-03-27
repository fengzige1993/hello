package learnClassAndMethod;

public class TestCarConstructor {
    public static void main(String[] args){
        Car anothrerCar = new Car("球状闪电号","银色");
        System.out.println("汽车的名字为："+anothrerCar.name);
        System.out.println("汽车的颜色为："+anothrerCar.color);
    }
}

//       汽车的名字为：球状闪电号
//       汽车的颜色为：银色