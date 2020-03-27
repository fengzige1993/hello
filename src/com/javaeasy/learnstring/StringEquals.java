package com.javaeasy.learnstring;

public class StringEquals {
    public static void main(String[] args){
        int value = 1;
        String str1 = "ABC" + value;
        String str2 = "abc" + value;
        String str3 = "ABC" + value;
        boolean equals12 = str1.equals(str2);
        boolean equals13 = str1.equals(str3);

        System.out.println("字符串str1和字符串str2相等："+equals12);
        System.out.println("字符串str1和字符串str3相等："+equals13);
    }
}
// String类的equals()方法可以用来判断两个String对象是否想相等，String对象相等的意思就是字符数相等，且其中的每个字符都一样；
//对象只存在逻辑上的相等，这种判断需要借助方法来实现的。
//使用 “==”运算符可以判断两个引用是否指向同一个对象。