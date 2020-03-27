package com.javaeasy.accessvariable;

/**
 * 使用private修饰的变量，设置外部调用修改/修改的方法
 */
public class ChangeSpeed {
    public static void main(String[] args){
        CarBase car = new CarBase();
        //创建一个CarBase类的对象
        car.setSpeed(999);
        //给这个对象的属性赋值
        //在调用方法的时候给speed属性赋值，因为这时赋的值 999 > MAX_SPEED 的值 99 所以返回为null
        //也就是什么都不做修改，所以这个时候打印输出的值为：0
        System.out.println("car的speed值为："+car.getSpeed());
    }
}
//car的speed值为：0