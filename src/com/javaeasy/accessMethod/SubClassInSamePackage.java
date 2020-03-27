package com.javaeasy.accessMethod;

/**
 * 父类中的private方法对子类是不可见的
 * private方法只对本类可见
 */
public class SubClassInSamePackage extends AccessMethods {
    public void usingProtectedMethod(){
        super.protectedMethod();
        super.defaulMethod();//在同一个包中，子类可以调用父类中默认修饰方法，
        //也就是说在同一个包中父类中的默认修饰方法对子类是可见的
    }

    public void protectedMethod(){//覆盖父类中protected的方法

    }

    public void usingPrivateMethod(){
//        super.privateMethod(); //父类中的private方法对子类是不可见的
    }
}
