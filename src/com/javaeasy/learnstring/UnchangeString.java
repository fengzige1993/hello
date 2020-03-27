package com.javaeasy.learnstring;

public class UnchangeString {
    public static void  main(String[] args){
        int value = 9;
        String base = "ABCDE";
        String str1 = base + value;
        String str2 = base.replace('C','c');
        System.out.println(base);
        System.out.println(str1);
        System.out.println(str2);
    }
}
