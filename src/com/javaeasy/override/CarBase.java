package com.javaeasy.override;

/**
 * Create by feng.hu on 2019/7/9
 * 汽车的公共类，公共的属性和方法
 * 子类覆盖父类的方法
 *  String className = this.getClass().getName();
 *  this 自引用指向的是一个实例对象，得到调用方法的对象所属的类（全限定名）
 */
public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;

    public CarBase(){
        System.out.println("CarBase类的构造方法被调用了");
    }

    public CarBase(String color,int maxSpeed,String name, int speed){
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.speed = speed;
        System.out.println("CarBase类的有参数构造方法被调用了!");
    }
    //新增followSpeed方法
    public void followSpeed(CarBase car){
        // this 自引用指向的是一个实例对象，得到调用方法的对象所属的类（全限定名）
        String className = this.getClass().getName();
        System.out.println("调用者的类型为"+className);
        int newSpeed = car.speed;
        if (newSpeed > speed){
            speedUp(newSpeed - this.speed);
        } else {
            slowDown(this.speed - newSpeed);
        }
    }

    public void speedUp(int p_speed){
        System.out.println("CarBase类中定义的speedUp(int)方法被调用了");
        int tempSpeed = 0;
        if (p_speed > 0);{
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= maxSpeed){
            speed = tempSpeed;
        }
    }

    public void slowDown(int p_speed){
        System.out.println("CarBase类中定义的slowDown(int)方法被调用了。");
        if (p_speed > 0){
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0){
                speed = tempSpeed;
            }
        }
    }
}

