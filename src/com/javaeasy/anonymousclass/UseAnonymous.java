package com.javaeasy.anonymousclass;

public class UseAnonymous {
    AnInterface intf = new AnInterface() {//创建一个抽象的内部类对象，并让接口的引用指向改对象
        @Override
        public void method() {

        }
    };

   AnAbstractClass absCls = new AnAbstractClass() { //通过抽象类使用匿名类
       @Override
       public void method() {   //实现抽象类中的抽象方法

       }
   };

   AnAbstractClass absClsII = new AnAbstractClass(5) { //使用匿名类，并给抽象类传递构造方法参数
       @Override
       public void method() { //实现抽象类中的抽象方法

       }
   };
}
