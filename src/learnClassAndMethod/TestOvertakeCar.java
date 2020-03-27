package learnClassAndMethod;

public class TestOvertakeCar {
    public static void main(String[] args){
        Car carFront = new Car();
        Car carBehind= new Car();
        carFront.raiseSpeed(80);
        carFront.direction = "东方";
        carBehind.raiseSpeed(50);
        carBehind.direction = "东方";
        System.out.println("carFront的速度为："+carFront.speed+"，行驶的方向为："+carFront.direction);
        System.out.println("carBehind的速度为："+carBehind.speed+"，行驶的方向为："+carBehind.direction);
        System.out.println("================================");
        System.out.println("carBehind 马上要调用 overtakeCar()方法了！");
        carBehind.overtakeCar(carFront);
        System.out.println("carFront的速度为:"+carFront.speed+"，行驶方向为:"+carFront.direction);
        System.out.println("carBehind的速度为："+carBehind.speed+"，行驶方向为："+carBehind.direction);

    }
}

//        carFront的速度为：80，行驶的方向为：东方
//        carBehind的速度为：50，行驶的方向为：东方
//        ================================
//        carBehind 马上要调用 overtakeCar()方法了！
//        carFront的速度为:80，行驶方向为:东方
//        carBehind的速度为：85，行驶方向为：东方