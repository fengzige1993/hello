package com.javaeasy.learnstring;

public class StringRefEquals {
    public static void main(String[] args){
        int value = 1;
        String str1 = "ABC" + value;
        String str2 = "ABC" + value;
        String str3 = str1;

        boolean equals12 = (str1 == str2);
        boolean equals13 = (str1 == str3);
        System.out.println("引用str1和引用str2相等："+equals12);
        System.out.println("引用str1和引用str3相等："+equals13);
    }
}

//两个引用之间也可以进行 “==” 运算，当两个引用指向同一个对象或者同时为null的时候，运算结果为true;否则为fase
//          字符串str1和字符串str2相等：false
//          字符串str1和字符串str3相等：true