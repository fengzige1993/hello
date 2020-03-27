package com.javaeasy.anonymousclass;

public abstract class AnAbstractClass { //抽象类
    public AnAbstractClass(int variable){
        //抽象类中的构造方法
    }

    public AnAbstractClass(){
        //抽象类中的构造方法
    }
    //注意：抽象类中可以包含抽象方法，但不是必须的，只要一个类中使用abstract 修饰，那么它就是抽象类，即使类中没有抽象方法
    public abstract void method(); //抽象类中的抽象方法
}
