package com.javaeasy.override;

public class ParentClass {
    private void privateMethod(){
        System.out.println("这是类ParentClass中的privateMethod()方法");
    }

    void defaultMethod(){
        System.out.println("这是类ParentClass中的defaultMethod()");
    }

    public void publicMethod(){
        System.out.println("这是类ParentClass中的publicMethod()方法");
    }

    protected void protectedMethod(){
        System.out.println("这是类ParentClass中的protectedMethod()方法");
    }

    public void test(){
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }
}
