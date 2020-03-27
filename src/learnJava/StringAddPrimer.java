package learnJava;

public class StringAddPrimer {
     public static void main(String[] args){
         int a = 5;
         int b = 7;
         String str1 = "将数字的字符拼接到字符串中:" + a;
         String str2 = a + b + "加法是从左到右运算的：";
         String str3 = "加法是从左到右运算的：" + a + b;
         String str4 = "我们可以使用括号改变运算顺序:" + (a + b);
         String str5 = "我们可以是用空字符串将两个变量分开" + a + "" + b;
         System.out.println(str1);
         System.out.println(str2);
         System.out.println(str3);
         System.out.println(str4);
         System.out.println(str5);

     }
}
//  将数字的字符拼接到字符串中:5
//  12加法是从左到右运算的：
//  加法是从左到右运算的：57
//  我们可以使用括号改变运算顺序:12
//  我们可以是用空字符串将两个变量分开57
