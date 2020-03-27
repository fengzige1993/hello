package com.javaeasy.learnstring;

public class SplitString {
    public static void main(String[] args) {
        String str = "AAA#BBB#CCC";
        String[] pieces = str.split("#");
        //以“#”为分隔符，将str分割
        //成一个String数组
        int len = pieces.length;
        System.out.println("将str按照\"#\"分割后得到的结果。");
        for (int i = 0; i < len; i++){
            System.out.println(pieces[i]);
        }
        System.out.println("======================================");
        //在字符串中找字符的索引值
        System.out.println("int indexOf(char ch)的用法如下：");
        String strSimple = "ABCDE";
        int indexSimple1 = strSimple.indexOf('C');
        int indexSimple2 = strSimple.indexOf('F');  //没有返回-1
        System.out.println("int indexSimple1 = str.indexOf('C')中indexSimple1值为："+indexSimple1);
        System.out.println("int indexSimple2 = str.indexOf('F')中indexSimple2值为："+indexSimple2);
        //一个字符串中去找另一个字符串的索引值
        System.out.println("======================================");
        System.out.println("String endsWith(suffix)的用法如下：");
        String str1 = "ABCDE";
        String target1 = "CD";
        String target2 = "CE";  //没有返回-1
        int index1 = str1.indexOf(target1);
        int index2 = str1.indexOf(target2);
        System.out.println("int index1 = str1.indexOf(target1)的index1值为："+index1);
        System.out.println("int index1 = str1.indexOf(target1)的index2值为："+index2);
        System.out.println("=======================================");
        System.out.println("String replace(char oldChar,char newChar)的用法如下：");
        //replace替换字符串中的内容
        String strReplacemain1 = "ABCDE";
        String strReplace1 = strReplacemain1.replace('C','c');
        System.out.println("String strReplace1 = str.replace('C','c')中strReplace1的值为:"+strReplace1);
        System.out.println("==========================================");
        System.out.println("String replace(charSequence target,CharSequence replacement)的用法如下：");
        String strReplacemain2 = "ABCDE";
        String strReplace2 = strReplacemain2.replace("CD","cd");
        System.out.println("String strReplace2 = strReplacemain2.replace(\"CD\",\"cd\")中StrReplace2的值为："+strReplace2);




    }
}
