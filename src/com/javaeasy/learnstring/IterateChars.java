package com.javaeasy.learnstring;

public class IterateChars {
    public static void main(String[] args) {
        String str = "this is a simple string.We will check how many \'s\'   chars in this.";
        char target = 's';   //需要统计的字符
        int len = str.length(); // 得到字符串的长度
        int count = 0;
        for (int i = 0; i < len; i++) { //遍历字符
            char ch = str.charAt(i); //得到字符串中的第i个字符位置的字if (ch == target){    // 做判断，就是i位置字符串与target字符如果相等就计数，算出有多好个S字符t.println("字符串的长度为："+len);
            System.out.println("字符串：" + "\"" + str + "\"" + "中包含" + count + "个" + "\'" + target + "\'" + "个字符");
        }
    }
}


