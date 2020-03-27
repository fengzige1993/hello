package com.javaeasy.method.usefinal;

/**
 *使用final关键字修饰的方法不可以被子类覆盖
 *
 */
public class SubClassOfUsingFinal extends UsingFinalInMethod{
    //        public final void finalMethod(){//错误，覆盖了父类中使用final修饰的方法
//        System.out.println("尝试覆盖父类中的final方法");
//    }
//
    public void commonMethod(){
        System.out.println("覆盖父类中的普通方法");
    }
}
