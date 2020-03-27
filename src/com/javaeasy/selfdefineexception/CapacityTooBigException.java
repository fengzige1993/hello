package com.javaeasy.selfdefineexception;

public class CapacityTooBigException  extends  Exception{
    public CapacityTooBigException(String message){
        super(message); //调用父类的构造方法，
    }
}
