package com.javaeasy.localeinnerclass;

public class UseLocaleInnerClasss {
    //外部类中的方法
    public void method(){
        //局部内部类
        class UseInner{
            private int variable =9;
            public int getVariable(){
                return variable;
            }
        }

        //使用局部内部类必须在局部内部类定义之后
        UseInner inner = new UseInner();
        inner.getVariable();
    }
}
