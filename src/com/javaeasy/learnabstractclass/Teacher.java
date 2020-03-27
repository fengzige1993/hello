package com.javaeasy.learnabstractclass;

public class Teacher extends Person {
    public Teacher(String name){ // 构造方法
        super(name);   //调用父类的构造方法
    }

    public void introduceSelf(){
        System.out.println("学生们好，我是一名老师，我的名字叫"+getName());
    }
}

