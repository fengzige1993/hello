package com.javaeasy.learnarray;

/**
 * create by feng.hu at 2019/7/11
 * 多维数组的长度
 * 这个长度是对应维度的长度
 */
public class LenOfMutiDArray {
    public static void main(String[] args){
        int[][] multiDArr = new int[9][19];
        System.out.println("第一维度长度为："+multiDArr.length);
        System.out.println("第二维的长度为："+multiDArr[0].length);
        System.out.println("第二维的长度为："+multiDArr[1].length);
        System.out.println("第二维的长度为："+multiDArr[2].length);

    }
}
//        第一维度长度为：9
//        第二维的长度为：19
//        第二维的长度为：19
//        第二维的长度为：19