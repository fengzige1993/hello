package com.javaeasy.variableoverride;

/**
 * sub.showOverrideValue()中子类中没有 showOverrideValue()方法，所以不存在覆盖
 * 所以去父类中去调用 这个showOverrideValue()方法
 * 然后调用类省略了this关键字子的成员变量 overrideValue
 * 成员变量中引用属于哪个类，就会得到哪个类的对象的成员变量。于引用指向的对象无关
 * 尽量不要使用变量的覆盖。
 */

public class TestVariableOverride2 {
    public static void main(String[] args){
        ParentClass parent = new ParentClass();
        System.out.println("===调用parent.showOverrideValue()===");
        parent.showOverrideValue();
        SubClass sub = new SubClass();
        System.out.println("===调用sub.showOverrideValue()===");
        sub.showOverrideValue();

        System.out.println("===使用sub给parent赋值===");
        parent = sub;
        System.out.println("===d调用parent.showOverrideValue()===");
        parent.showOverrideValue();

    }
}
//===调用parent.showOverrideValue()===
//        overrideValue的值是5
//        ===调用sub.showOverrideValue()===
//        overrideValue的值是5
//        ===使用sub给parent赋值===
//        ===d调用parent.showOverrideValue()===
//        overrideValue的值是5
//用this关键字指出本类中的成员变量
//===调用parent.showOverrideValue()===
//        overrideValue的值是5
//        overrideValue的值是(用this关键字)5
//        ===调用sub.showOverrideValue()===
//        overrideValue的值是5
//        overrideValue的值是(用this关键字)5
//        ===使用sub给parent赋值===
//        ===d调用parent.showOverrideValue()===
//        overrideValue的值是5
//        overrideValue的值是(用this关键字)5