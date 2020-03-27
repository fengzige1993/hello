package com.javaeasy.learnextends;

public class ErrorAssignment {
    public static void main(String[] args){
        Bus bus = new Bus();
//      SportsCar sportsCar = bus;
  }
}


//Error:(6, 31) java: 不兼容的类型: com.javaeasy.learnextends.Bus无法转换为com.javaeasy.learnextends.SportsCar
//因为Bus类和SportsCar类并没有继承关系。SportsCar类并非是Bus类的父类，所以赋值是错误的
//错误中所谓的“不兼容的类型”意思就是赋值的目标引用sportsCar所属的类并不是bus引用指向的对象所属的类的父类，所有无法将
//Bus类的对象视为SportsCar类的对象，因此也就不能使用bus给sportsCar赋值
