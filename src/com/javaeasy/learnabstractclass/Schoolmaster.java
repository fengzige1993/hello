package com.javaeasy.learnabstractclass;

public class Schoolmaster extends Person {
    public Schoolmaster(String name){ // 构造方法
        super(name);        // 调用父类的构造方法
    }

    //覆盖了父类中的introduceSelf()方法
    public void introduceSelf(){
        System.out.println("大家好，我是本校校长，我的名字叫"+getName());
    }
}
