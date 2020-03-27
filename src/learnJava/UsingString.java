package learnJava;

public class UsingString {
    public static void main(String[] args){
        String emptyStr = "";
        //String的长度可以是0到足够大;
        String str1 = "字符串中可以同时使用中文和English";
        //字符串中可以中英文混合使用
        String str2 = "。";
        //对于字符串即使只包含一个字符，也要用创引号
        String plusStr = str1 + str2;
        //字符串可以“相加”,准确的来说是字符串之间的拼接
        System.out.println(plusStr);
    }
}
//字符串中可以同时使用中文和English。