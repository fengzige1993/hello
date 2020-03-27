package com.javaeasy.logcarinterface;

/**
 * 接口是一种规范，它定义了一个抽象的规范，这个规范的规则就是接口中的“抽象方法”
 * 接口也是一种类型，习惯上称呼接口为抽象类型
 * 接口与类十分相似，他们的本质不同是：类是一种具体的类型，它包含了每个方法的代码
 * 而接口是一种抽象的类型，它只包含方法的定义，却没有包含方法的具体代码
 * 所谓抽象，就是只有“方法的定义”而没有“具体如何实现和这个方法的代码”
 */

//abstract 用来表示一个元素是抽象的，这里用来表示一个借口是抽象的，
//interface 关键字表示这是一个 接口类型，
// RecordeAble 是接口名
public abstract interface RecordeAble {
    /**
     * 接口中的方法多了一个abstract修饰，表示抽象的方法 + 返回值类型 + 方法名，接口中的方法没有方法体，直接已分号结束
     */
    public abstract TransportStatusForLog getTransportsStatus();
}
