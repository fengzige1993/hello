package com.javaeasy.learnabstractclass;

/**
 * 父类给其他类继承
 */

// 类声明中使用abstract关键字修饰这个类，表示此类是一个抽象的类，这点与接口类似
abstract class Person {
    private String name;

    //构造方法必须与类名相同，
    //构造方法没有返回值类型（不能使用void），构造方法内可以使用return

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    // 介绍自己，在这里，因为不知道自己的具体身份，所以方法留空，子类应该覆盖此方法
//    public void introduceSelf(){
//    }

    //将此方法变成一个抽象方法，使用abstract修饰此方法，并去掉方法体
    public abstract void introduceSelf();
}






























