package com.javaeasy.selfdefineexception;

public class Cup {
    private int capacity;
    public int getCapacity(){
        return capacity;
    }
    //使用throws关键字声明方法可能会抛出Exception类型的异常
    public void setCapacity(int capacity) throws CapacityTooBigException,CapacityTooSmallException{
        if (capacity > 10000 ){
            CapacityTooBigException  big = new CapacityTooBigException("杯子的容积不能超过10000，非法的容积为："+capacity);
            throw big;
        }else if (capacity < 0) {
            CapacityTooSmallException small = new CapacityTooSmallException("杯子的容量不能小于0："+capacity);
            throw small;
        }

        this.capacity = capacity;
    }
}
