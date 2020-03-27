package learnJava;

public class CountAndConvert {
    public static void main(String[] args) {
        double doubleValue = 9.9;
        int intValue = 9;
        double result = doubleValue + intValue;
        System.out.println(result);
    }
}
////总结：1.当操作符的操作数有不同的精度是，java会将低精度的操作数转换为高精度的操作数，然后进行运算，运算的结果也是高精度的值
////      2.对于直接出现在程序中的整数，Java会当做int类型的处理；对于浮点数，java会当做double处理