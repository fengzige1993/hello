package com.javaeasy.accessMethod.diffpackage;

/**
 * public 修饰的方法其实是没有任何访问限制的
 * 对于本类、子类、同包中的类以及不同包的类都是可见的
 * 也是方法最常用的访问修饰符
 */

import com.javaeasy.accessMethod.AccessMethods;

public class DiffPackage {
    public void usingPublicMethod() {
        AccessMethods methods = new AccessMethods();//创建AccessMethods的一个类对象
        methods.publicMethod(); //调用AccessMethods中的publicMethods方法
//        methods.defaultMethod(); //在不同包中去调用默认修饰方法时错误的
    }
}
