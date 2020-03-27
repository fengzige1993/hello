package com.javaeasy.learnstring;

public class SubString {
    public static void main(String[] args){
        String str = "ABCDEFGH";
        char target = 'C';
        int len = str.length();
        String result  = null;
        for (int i = 0; i < len; i++){
            if (target == str.charAt(i)){  //相等就是true 执行条件。
                result = str.substring(i+1);  // subString(int beginIndex) 是从第bgginIndex个字符串开始到结束。
                break;
            };
        }
        if (result != null){
            System.out.println("结果如下。"+result);
        } else {
            System.out.println("没有在字符串中找到目标字符");
        }
    }
}
