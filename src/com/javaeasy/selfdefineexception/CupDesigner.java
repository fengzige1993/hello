package com.javaeasy.selfdefineexception;

public class CupDesigner {
    //定义一个Cup类的引用（变量）
    private Cup cup;
    //定义一个CupDesigner的构造方法
    public CupDesigner(Cup cup){
        this.cup = cup;
    }

    //在方法代码中抛出，因调用 setCapacity() 方法而传递过来的异常
    public void designCupCapacity(int capacity) throws CapacityTooSmallException, CapacityTooBigException{
        //调用cup的setCapacity()方法来修改其capacity属性
        cup.setCapacity(capacity);
        System.out.println("成功设计出了容积为"+capacity+"的杯子。");
    }
}
