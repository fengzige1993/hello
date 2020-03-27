package com.javaeasy.learnabstractclass;

public class Student extends Person {
    //构造方法
    public Student(String name){
        super(name);    //调用父类的构造方法
    }

    public void introduceSelf(){
        System.out.println("嗨，大家好，我是一名学生，我的名字叫做"+getName());
    }
}

