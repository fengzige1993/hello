package com.javaeasy.learnextends;

public class AsSuperClass {
    public static void main(String[] args){
        SportsCar sports = new SportsCar();
        CarBase base = sports;
//        base.addN(11)     //
        sports.addN(30);
    }
}

//Error:(7, 13) java: 找不到符号
//        符号:   方法 addN(int)
//        位置: 类型为com.javaeasy.learnextends.CarBase的变量 base
//CarBase类的引用指向了SportsCar类的对象，则通过这个引用只能够调用Carbase类中有的属性和方法，而不能访问SportsCar类中的属性和方法。