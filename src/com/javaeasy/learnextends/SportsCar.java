package com.javaeasy.learnextends;

public class SportsCar extends CarBase {
    public int nAmount = 90; //保存剩余的氮气量

    public SportsCar(){
        super();  //调用父类中无参数的构造方法
        // 通过super关键字调用父类的构造方法，只能在子类的构造方法中使用
        //必须在子类的构造方法中的第一行使用此语法
        //语法中的参数列表需要和父类中的某个构造方法的形式参数匹配
        System.out.println("SportsCar类的构造方法被调用了！");
    }

    public SportsCar(String color, int maxSpeed, String name, int speed, int amount){
        super(color,maxSpeed,name,speed); //第一行调用父类有参的构造方法
        nAmount = amount;
        System.out.println("SportsCar类有参数的构造方法被调用");
    }
    public void speedUpUsingN(int p_amout){
        int realAmount = 0;  //真正加速的氮气量
        if (nAmount <=p_amout){   //如果剩余的氮气量不能满足本次使用，
            realAmount = nAmount; //则剩余的氮气量就是真正用于加速的氮气量，
            nAmount = 0;  //把剩余的氮气量清零
        } else{
            realAmount = p_amout;  //否则 使用的氮气量就是真正用于加速的氮气量
            nAmount -= p_amout;   //计算剩余的氮气量，就是使用的氮气量
        }
        int speedUp = (int)(realAmount * 0.25); //使用氮气的量乘以 25%就是真正提升的速度
        speed += speedUp;   //提升速度之后的速度
    }

    public void addN(int p_amout){
        if (p_amout < 0){ //如果需要增加的氮气小于0
            return;      //就什么都不做，也就是返回为null
        }
        nAmount += p_amout;   //否则就增加剩余的氮气量
    }

}
