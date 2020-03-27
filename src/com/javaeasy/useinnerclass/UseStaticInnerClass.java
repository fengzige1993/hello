package com.javaeasy.useinnerclass;

import com.javaeasy.innerclass.UseInnerClassOutside.StaticInnerClass;


public class UseStaticInnerClass {
    public static void main(String[] args){
        StaticInnerClass inner = new StaticInnerClass();
        System.out.println("静态类内部方法的返回值："+inner.getVariable());
    }
}
