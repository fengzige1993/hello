package learnClassAndObject;

public class UseMotorcade {
    public static void main(String[] args){
        Motorcade groupCar = null;
        groupCar = new Motorcade();
        groupCar.name = "一个车队";
        int carCount = 5;
        groupCar.cars = new Car[5]; // 创建了一个car[]类的引用  group.cars 的对象，每个引用的值都是null,
        String direction = "镇江";
        System.out.println("车队的名字是："+groupCar.name);
        for (int i = 0; i < carCount; i++){
            groupCar.cars[i] = new Car();   //此时 car类的引用 groupCar.cars[i] 指向car类的对象，才有了属性值
            groupCar.cars[i].name = "汽车" + (i + 1);
            groupCar.cars[i].direction = direction;
            System.out.println(groupCar.cars[i].name+"车子的颜色是："+groupCar.cars[i].color);
        }
//        System.out.println("车队的名称为："+groupCar.name);
//        System.out.println("车队中汽车的名字分别为：");
//        for (int i = 0; i < carCount; i++){
//            System.out.println(groupCar.cars[i].name);
//      }
    }
}
