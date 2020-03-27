package learnClassAndObject;

public class UseCar {
    public static void main(String[] args){
        Car carPassedBy;     // 声明一个Car类的变量，和数组中的变量名一样，现在只会一个空壳而已。carPassedBy没有指向任何的Car类实体，所以不能使用
        carPassedBy = new Car(); //创建一个car类的实体，也就是用Car类的变量指向我们创建的一个Car实体，之后就可以通过Car类的变量使用Car类的实体了
        carPassedBy.speed = 60;  //通过carPassedBy给Car实体的各个属性赋值
        carPassedBy.color = "白色";
        carPassedBy.name = "雪铁龙一号";
        carPassedBy.direction = "镇江方向";
        System.out.println("经过的汽车的速度为："+carPassedBy.speed);
        System.out.println("它的颜色是："+carPassedBy.color);
        System.out.println("汽车的名字叫做："+carPassedBy.name);
        System.out.println("汽车行驶的方向为："+carPassedBy.direction);
    }
}
