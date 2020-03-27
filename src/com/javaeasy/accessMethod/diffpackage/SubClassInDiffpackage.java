package com.javaeasy.accessMethod.diffpackage;

/**
 * 默认修饰方法对同包中的可见
 * 对于不同包是不可见的
 * protected 对子类 or 同包类可见
 */

import com.javaeasy.accessMethod.AccessMethods;


public class SubClassInDiffpackage extends AccessMethods{
    public void usingPublicMethod(){
        super.publicMethod();//通过super关键字调用父类中的方法
    }

    public void publicMethod(){//覆盖了父类中的方法

    }

    public void usingProtectedMethod(){
        super.protectedMethod(); //调用父类中的protectedMethod
//        super.defaultMethod();// 错误，在不同的包中，父类默认访问控制符修饰的方法对子类不可见
    }

    public void protectedMethod(){

    }
}
