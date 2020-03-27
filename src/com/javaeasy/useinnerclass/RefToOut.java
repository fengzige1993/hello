package com.javaeasy.useinnerclass;

import com.javaeasy.innerclass.UseMembers;  //引入使用的类
import com.javaeasy.innerclass.UseMembers.InnerVariableClass; //引入使用的内部类

public class RefToOut {
    public static void main(String[] args){
        UseMembers out = new UseMembers();
        //使用out引用创建一个内部类对象
        InnerVariableClass inner =out.new InnerVariableClass();
        //通过inner调用usrOutMember()方法
        System.out.println("内部类方法的返回值："+inner.useOutVariable());
    }
}
