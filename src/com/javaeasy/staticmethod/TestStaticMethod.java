package com.javaeasy.staticmethod;

public class TestStaticMethod {
    public static void main(String[] args){
        System.out.println("=========调用ParentClass.staticMethod=======");
        ParentClass.staticMethod();
        //通过类名调用ParentClass调用静态方法staticMethod
        System.out.println("=========调用SubClass.staticMethod==========");
        SubClass.staticMethod();
        //通过类名SubClass调用staticMethod静态方法
    }
}
//=========调用ParentClass.staticMethod=======
//        这是ParentClas类的staticMethod方法
//        =========调用SubClass.staticMethod==========
//        这是SubClass类的staticMethod()方法