package com.javaeasy.learnextends;

public class ForceConvertion {
    public static void main(String[] args){
        SportsCar SportsCar = new SportsCar();
        CarBase base = SportsCar;
        System.out.println("尝试将base引用强制类型转换为SportsCar类的引用");
        SportsCar converted = (SportsCar) base;
        System.out.println("转换成功");
        System.out.println("使用converted调用 addN()方法");
        converted.addN(45);
        System.out.println("converted.nAmount的值为："+converted.nAmount);
        Object objCar = converted;
        System.out.println("将Object类引用强制类型转换为 CarBase类引用");
        CarBase base2 = (CarBase)objCar;
        System.out.println("将Object类引用强制类型转换为SportsCar类引用");
        SportsCar sportsCar = (SportsCar)objCar;
    }

}
