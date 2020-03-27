package com.javaeasy.innerclass;

public class InnerClasses {
    class Inner{
        public int variable;

    }

    static class StaticInner{
        public static int useInner(){
            //静态内部类可以通过创建非静态内部类的对象来调用其内部的变量
            InnerClasses out = new InnerClasses();
            Inner inner = out.new Inner();
            return  inner.variable;
        }
    }
}
