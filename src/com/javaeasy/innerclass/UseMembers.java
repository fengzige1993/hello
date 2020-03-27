package com.javaeasy.innerclass;

public class UseMembers {
    private int variableInOutClass=5;

    //内部类
    public class InnerVariableClass{
        private  int variableInInnerClass;
        public int useOutVariable(){
            return variableInInnerClass + variableInOutClass;
        }
    }

    //在方法中创建内部类的实例
    public void useInnerClassInstance(){
        InnerVariableClass inner = new InnerVariableClass();
        inner.useOutVariable();
        System.out.println("内部类中的private变量："+inner.variableInInnerClass);
    }
}
