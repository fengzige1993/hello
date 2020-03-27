package com.javaeasy.accessMethod;

public class SamePackage {
    public void usingPublicMethod(){
        AccessMethods methods = new AccessMethods();
        methods.publicMethod(); //调用同包中的public方法
        methods.protectedMethod();  //调用同包中protected方法
        methods.defaulMethod(); //调用同包中默认修饰方法
    }
}
