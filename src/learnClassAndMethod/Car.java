package learnClassAndMethod;

public class Car {
    int speed;
    String color;
    String name;
    String direction;
    boolean isTrafficAdmin;

    public Car(){
//        this.name = "Java护航者";
//        this.color = "咖啡豆色";
        this("Java护航者","咖啡豆色",false); // this关键字后面加实参，语法规定：它会在Car类中搜搜符号要求的构造方法，
        // 通过this + 构造方法实参，可以在一个构造方法中调用同类的另一个构造方法
        // 通过this + 构造方法实参，调用同类中另一个构造方法的时候，必须将这个放在构造方法的第一行
    }

    // 构造方法没有返回值，构造方法名必须于类名一致，所以可以看出与类名一致的就是方法就是构造方法，
    //构造方法没有返回值类型（不能使用void），但是构造方法内可以使用return.
    //一个类可以有多个构造方法，他们之间是重载关系。必须使用参数加以区分
    public Car(String p_name,String p_color){
//        this.name = p_name;
//        this.color = p_color;
        this(p_name,p_color,false);
    }

    public Car(String p_name,String p_color,boolean p_trafficAdmin ) {
        this.name = p_name;
        this.color = p_color;
        this.isTrafficAdmin = p_trafficAdmin;
    }

    public void driveCar(){
        speed = 50;
        direction = "南方";
    }
    public void raiseSpeed(int p_speed){
        if (p_speed < 0){
            System.out.println("p_speed的值小于0，raiseSpeed()方法将结束");
            return;  //结束raiseSpeed()方法，在方法没有返回值（返回值为空的时候）可以只使用return结束方法的执行
        }
        int currentSpeed = speed + p_speed;
        speed = currentSpeed;
    }
    //重载 raiseSpeed(int)方法;
    public void raiseSpeed(byte p_speed){
        if (p_speed < 0){
            System.out.println("p_speed 的值小于0，raiseSpeed()方法将接受");
            return;
        }
        int currentSpeed = speed + p_speed;
        speed = currentSpeed;
    }

    public void setSpeedAndDirection(int p_speed,String p_direction){
        speed = p_speed;
        direction = p_direction;
    }
    public boolean isOverspeed(){
        if (speed > 80){
            return true;
        } else{
            return false;
        }
    }
    public void overtakeCar(Car anotherCar){
        speed = anotherCar.speed + 5;
        direction = anotherCar.direction;
    }

    public void setNameForAndtherCar(Car anotherCar,String newName){
        if (!isTrafficAdmin){
            System.out.println("你不是交通管理员，无权调用此方法！");
            return;
        }
        anotherCar.name = newName;
    }

    public void stopAontherCar(Car anotherCar){
        if (!isTrafficAdmin){
            System.out.println("你不是交通管理员，无权调用此方法！");
            return;
        }
        anotherCar.speed = 0;
    }

    public CarStatus getAnotherCarStatus(Car anotherCar){
        if (!isTrafficAdmin){
            System.out.println("你不是交通管理员，无权调用此方法");
            anotherCar.speed = 0;
        }
        CarStatus status = new CarStatus(anotherCar.speed,anotherCar.direction);
        return status;
    }

    public boolean isLegalCarStatus(CarStatus status){
        if (status.speed <= 80){
            return true;
        } else {
            return false;
        }
    }

    public void setSpeed(int p_speed){
        if (p_speed < 0){
            System.out.println("汽车速度不能为负值，方法将推出。");
            return;
        }
        this.speed = p_speed;
    }

    public void printCarRunningMessage(){
        System.out.println("车名为"+"\""+this.name+"\""+"的汽车行驶速度为:"+"\""+this.speed+"\""+"，汽车的行驶方向为："+"\""+this.direction+"\"");

    }
}

