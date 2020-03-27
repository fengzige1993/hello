package com.javaeasy.learnarray.clone;

public class PrimerArrClone {
    public static void main(String[] args){
        int[] arr = {7,8,9};   //创建一个int类型的一维数组
        //调用此数组的clone（）方法
        int[] clonedArr = (int[]) arr.clone();
        //给元组的第三个元素赋值
        arr[2] = 777;
        //给clone处的数组第三个元素赋值
        clonedArr[2] = 888;
        //分别输出两个数组的第2个元素和第三个元素
        System.out.println("arr的第二个元素的值是："+arr[1]);
        System.out.println("arr的第三个元素的值是:"+arr[2]);
        System.out.println("cloneArr的第二个元素的值是："+clonedArr[1]);
        System.out.println("cloneArr的第三个元素的值是："+clonedArr[2]);
    }
}
