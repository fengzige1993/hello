package com.javaeasy.learnstatic;

public class CountObjMain {
    public static void main(String[] args){
        CountObject obj1 = new CountObject();
        System.out.println("现在共创建了"+CountObject.objCounter+"个CountObject类的对象");
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();
        System.out.println("现在共创建了"+CountObject.objCounter+"个CountObject类的对象。");
    }
}
