package com.javaeasy.staticmethod;

/**
 * Create by Feng.Hu on 2019/7/20
 *静态方法的使用语法
 */
public class StaticMethodClass {
    public static int staticValue = 5;//创建一个静态变量并赋值
    public int common = 7;            //创建一个普通变量

    //创建一个静态的方法
    public static void staticMethod(int baseValue){ //一个static修饰的静态方法
        int resultValue = baseValue + staticValue;
        //这里使用了局部变量 参数 + 静态变量
        // 静态方法不能够使用非静态变量
        //静态方法也不能调用非静态变量
        System.out.println("resultValue的值是："+resultValue);
        //向控制台输出局部变量的值
    }

    public static void anotherStaticMethod(){ //另一个静态方法
        //在一个静态方法中调用另一个静态方法
        StaticMethodClass.staticMethod(5);
    }

    public void commonMethod(){//一个普通的方法
        //可以在非静态方法中调用静态方法
        //但是静态方法中不能调用非静态方法
        StaticMethodClass.staticMethod(6);
    }

}
