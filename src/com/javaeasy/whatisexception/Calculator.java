package com.javaeasy.whatisexception;

public class Calculator {
    public static void divide(String a,String b){
        double valueA = Double.valueOf(a);
        double valueB = Double.valueOf(b);
        double result = valueA / valueB;
        System.out.println(a+"除以"+b+"的结果是："+result);
    }
}
