package com.javaeasy.staticmethod;

/**
 * 对于普通的方法Java会根据引用所指向的对象类型类决定执行哪个方法
 * 引用指向的对象类型是动态可变的，所以给Java程序带来了多态
 * 而对于静态方法，java会根据类名或者引用所属的类来决定调用哪个静态方法
 * 所以静态方法不存在多态的性质
 * 因为静态方法不存在多态，所以使用引用来调用静态方法是没有任何意义的
 * java推荐使用类名直接调用静态方法或者静态变量
 */

public class TestStaticMethod2 {
    public static void main(String[] args){
        //首先创建一个父类的对象
        ParentClass parent = new ParentClass();
        System.out.println("============通过ParentClass类的引用parent调用commonMethod()方法==================");
        parent.commonMethod();
        System.out.println("============通过ParentClass类的引用parent调用staticMethod()方法==================");
        parent.staticMethod();
        System.out.println("============让parent引用指向SubClass的对象=======================================");
        //父类ParentClass的引用parent指向子类的对象
        parent = new SubClass();
        System.out.println("============通过ParentClass类的引用parent调用子类对象的commonMethod()方法==================");
        parent.commonMethod();
        //因为子类SubClass中的commonMethod()方法是覆盖了父类中的方法，所以会调用子类中普通方法
        System.out.println("============通过ParentClass类的引用parent调用子类对象的staticMethod()方法==================");
        parent.staticMethod();
        //对于静态方法java会根据引用的类型而非引用所指向的对象的类型来决定调用哪个方法，
        //此时虽然parent指向的是子类的对象，但是它还是ParentClass类的引用，所以最终会调用的还是ParentClass中的staticMethod;
    }
}
//============通过ParentClass类的引用parent调用commonMethod()方法==================
//        这是ParentClass类中的commonMethod方法
//        ============通过ParentClass类的引用parent调用staticMethod()方法==================
//        这是ParentClas类的staticMethod方法
//        ============让parent引用指向SubClass的对象=======================================
//        ============通过ParentClass类的引用parent调用子类对象的commonMethod()方法==================
//        这是SubClass类中的commomMethod()方法
//        ============通过ParentClass类的引用parent调用子类对象的staticMethod()方法==================
//        这是ParentClas类的staticMethod方法

