package com.javaeasy.staticmethod;

public class SubClass extends ParentClass {
    public static void staticMethod(){
        //静态方法，不存在覆盖
        System.out.println("这是SubClass类的staticMethod()方法");
    }

    public void commonMethod(){
        //非静态方法，覆盖了父类中的同名方法
        System.out.println("这是SubClass类中的commomMethod()方法");
    }
}
