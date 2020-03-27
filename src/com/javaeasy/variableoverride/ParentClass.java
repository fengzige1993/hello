package com.javaeasy.variableoverride;

public class ParentClass {
    public int overrideValue;
    public ParentClass(){
        overrideValue = 5;
}

    public void showOverrideValue(){
        System.out.println("overrideValue的值是"+overrideValue);
        //同一个类中访问成员变量是可以省略this关键字的 showOverrideValue()方法等价于
        System.out.println("overrideValue的值是(用this关键字)"+this.overrideValue);
    }
}
