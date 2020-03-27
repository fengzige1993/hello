package com.javaeasy.variableoverride;

/**
 * 在变量的覆盖中，所得到的变量值取决于引用的类型
 * 而非引用指向的对象的类型
 */

public class TestVariableOverride {
    public static void main(String[] args){
        ParentClass parent = new ParentClass();
        System.out.println("===使用ParentClass的引用parent 获取overrideValue的值=====");
        System.out.println("Parent.overrideValue的值是："+parent.overrideValue);
        //父类的引用指向子类SubClass,因为变量的覆盖结果取决于访问变量时引用的类型
        System.out.println("===Parent指向了SubClass的对象============================");
        parent = new SubClass();
        System.out.println("Parent.overrideValue的值是："+parent.overrideValue);
        System.out.println("===sub指向了SubClass的对象===============================");
        //赋值之后，这时，sub和parent指向同一个对象了
        SubClass sub = (SubClass)parent;
        System.out.println("sub.overrideValue的值是："+sub.overrideValue);
        System.out.println("parent.overrideValue的值是："+((SubClass) parent).overrideValue);
    }
}
//===使用ParentClass的引用parent 获取overrideValue的值=====
//        Parent.overrideValue的值是：5
//        ===Parent指向了SubClass的对象============================
//        Parent.overrideValue的值是：5
//        ===sub指向了SubClass的对象===============================
//        sub.overrideValue的值是：9
//        parent.overrideValue的值是：9