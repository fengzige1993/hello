package com.javaeasy.staticmethod;

/**
 * 静态方法是直接通过类名调用的，它无法直接操作类中某一个对象的实例变量
 * 它只能访问静态变量和静态方法
 */
public class UsingMath {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        double result = Math.pow(a,b);
        System.out.println("a的b次方结果如下："+result);
        double random = Math.random();
        System.out.println("本次生成的随机数是："+random);
    }
}

//a的b次方结果如下：125.0
//        本次生成的随机数是：0.8493476182131674