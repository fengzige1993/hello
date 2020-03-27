package com.javaeasy.learnextends;

public class ConversionError {
    public static void main(String[] args){
        CarBase base = new CarBase();
        SportsCar sportsCar  = (SportsCar)base;
    }
}

//CarBase类的构造方法被调用了
//        Exception in thread "main" java.lang.ClassCastException: com.javaeasy.learnextends.CarBase cannot be cast to com.javaeasy.learnextends.SportsCar
//        at com.javaeasy.learnextends.ConversionError.main(ConversionError.java:6)

//base引用实际指向的是一个CarBase类的对象，base是CarBase类的对象，无法将CarBase类的对象当做一个SportsCar类的对象使用
//这里没有父类的引用指向一个子类的引用，就使用了强制类型转换了，所以这里是错误的，因为只有确定某个父类的引用指向的是子类的对象，
//我们才可以通过强制类型转换来将父类的引用转换为子类的引用。 并使用转换后的值给子类的引用赋值。