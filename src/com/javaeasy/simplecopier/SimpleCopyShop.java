package com.javaeasy.simplecopier;

/**
 * 例程（一个简单的复印社程序）
 * 测试历程
 */

public class SimpleCopyShop {
    public static void main(String[] args){
        Copier canon = new Copier("佳能");
        Copier sharp = new Copier("夏普");
        Employee simth = new Employee("Simth",2,canon);
        Employee john = new Employee("John",3,sharp);
        simth.start();
        john.start();
    }
}





