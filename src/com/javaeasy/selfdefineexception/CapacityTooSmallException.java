package com.javaeasy.selfdefineexception;

public class CapacityTooSmallException extends Exception {   //异常类继承自Exception类
    //构造方法
    public CapacityTooSmallException(String message){
        super(message);  //调用父类的构造方法
    }

}
