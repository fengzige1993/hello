package com.javaeasy.learnextends;

public class AutoConversion {
    public static void main(String[] args){
        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        carBase.speedUp(77);
        System.out.println("carBase.speed的值为："+carBase.speed);
        System.out.println("sportsCar.speed的值为："+sportsCar.speed);
        sportsCar.speedUpUsingN(77);
        System.out.println("carBase.speed的值为："+carBase.speed);
        System.out.println("SportsCar.speed的值为："+sportsCar.speed);
    }
}
// Java中可以把一个子类的对象当做父类的对象来使用
//这个对象是SportCar类的对象，但是在两个引用眼中却是完全不同的，
//对于sportsCar引用，它会把这个对象当做是SportsCar类的对象，所以通过这个引用来使用SportsCar类中的所有方法和属性
//---也包括SportsCar类从其父类继承的方法和属性，对于carBase引用，它会把这个对象当做是CarBase类的对象，我们无法通过
//这个引用来使用SportsCar中特有的方法和属性。