package com.javaeasy.innerclass;

public class OutClass {
    private int Variable = 9;

    public OutClass(){
    }

    public int getVariable(){
        return Variable;
    }

    //以下是内部类的代码（类中声明的另一个类，也就是内部类）
    public class InnerClass{
        public InnerClass(){    //内部类InnerClass的构造方法
        }
        //内部类InnerClass 中声明的变量
        private int innerVariable;
        //内部类InnerClass中的方法
        public int getInnerVariable(){
            return innerVariable;
        }
    }

    //添加新的方法，在方法中使用内部类
    public int useInnerClass(){
        //创建一个内部类的实例，并让内部类的引用指向这个实例
        InnerClass inner = new InnerClass();
        //通过内部类的引用调用内部类的方法，并使用方法的返回值给局部变量赋值
        int valueFromInner = inner.getInnerVariable();
        return valueFromInner;
    }
}
