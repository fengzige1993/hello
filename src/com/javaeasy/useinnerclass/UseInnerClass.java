package com.javaeasy.useinnerclass;

import com.javaeasy.innerclass.UseInnerClassOutside;
import com.javaeasy.innerclass.UseInnerClassOutside.InnerClass;

public class UseInnerClass {
    public static void main(String[] args){
        UseInnerClassOutside out = new UseInnerClassOutside();
        InnerClass inner = out.new InnerClass();
        System.out.println("内部类方法的返回值："+inner.getVariable());
    }
}
