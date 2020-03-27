package com.javaeasy.learnarray.clone;

/**
 * create by feng.hu at 2019/7/2
 * 一维数组中的一个方法clone()方法，其方法的返回值就是数组中内容的复制
 * 对于基本数据类型中一维数组，次cloen方法适用
 * 对于不是基本数据类型的数组（当类型是一个定义的类的时候）
 * 这时候数组的内容是指向对象的引用而不是对象本身，所以这时候数组的clone并没有产生新的元素对象
 * 简单来说就是clone的数组与原数组是指向同一个对象的，数组元素的赋值同步变化
 * 只有当clone的数组内容新建一个对象时，即两个数组指向不同的对象，数组间的元素变化无关系
 */
public class ObjectClone {
    public static void main(String[] args){
        TestClone[] arr = new TestClone[2];
        //创建一个TestClone 的一维数组

        arr[1] = new TestClone();
        //并给第二个元素赋值
        System.out.println(arr[1].value);

        TestClone[] cloneArr=(TestClone[])arr.clone();
        //clone出一个新的TestClone的一维数组

        arr[1].value = 777;
        //给arr的第二个元素赋值

        cloneArr[1].value = 999;
        //给coneArr的第2元素的value的属性赋值

        //输出两个数组的第2个元素的value属性值
        System.out.println("arr的第二个元素的value属性的值是："+arr[1].value);
        System.out.println("clone的第二个元素的value属性的值是："+cloneArr[1].value);

        //给cloneArr与arr的第2个元素赋值
        cloneArr[1] = new TestClone();
        arr[1].value = 777;
        cloneArr[1].value = 999;

        //输出两个数组的第二个元素的value属性值
        System.out.println("arr的第二个元素的value属性值是："+arr[1].value);
        System.out.println("cloneArr的第二个元素的value属性的值是："+cloneArr[1].value);


    }
}


//        9
//        arr的第二个元素的value属性的值是：999
//        clone的第二个元素的value属性的值是：999
//        arr的第二个元素的value属性值是：777
//        cloneArr的第二个元素的value属性的值是：999