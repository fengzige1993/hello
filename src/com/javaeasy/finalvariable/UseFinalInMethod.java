package com.javaeasy.finalvariable;

/**
 * 对于局部变量，只有final修饰符可以修饰
 * 使用final修饰的成员变量与修饰成员变量的作用是一样的
 * 即局部变量的值是不可以更改的
 */

public class UseFinalInMethod {
    public static void main(String[] args){
        final int a = 9;    //使用final修饰局部变量a
    }

    public void commonMethod(){
        final int a = 9; //使用final修饰局部变量a
    }
}
