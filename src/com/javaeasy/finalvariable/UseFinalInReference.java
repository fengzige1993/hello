package com.javaeasy.finalvariable;

/**
 * 当使用fianl修饰引用时，不能让这个引用指向别的对象，也就是不能给这个引用赋值
 * 但是可以使用这个引用正常的操作指向的对象，包括修改对象的属性值
 * 也就是说，不可改变的是引用，而不是引用指向的对象
 */

public class UseFinalInReference {
    public static void mian(String[] args){
        //使用final修饰引用 finalRef 指向FinalVariable类的对象
        final FinalVariable finalRef = new FinalVariable();
//        finalRef = new FianlVariable();      不能给final变量赋值

        finalRef.commomVariable = 10;
        //使用finalRef修改其指向对象的属性值

    }
}
