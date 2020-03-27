package learnJava;

public class AutoConvert {
    public static void main(String[] args){
        double doubleValue = 9/4;
        System.out.println(doubleValue);
    }
}
//对于这种直接写在程序中的整数，java使用int来计算的，那么9/4就是两个int值的除法，它不会保留小数部分，所以它的值就是2.
//然后Java会将2转换为double类型并赋值给 doubleValue变量，所以doubleValue的变量就是2.0
//对于浮点数，就算小数部分是0也要加上，以此用来表示它是一个浮点数。
//总结：1.当操作符的操作数有不同的精度是，java会将低精度的操作数转换为高精度的操作数，然后进行运算，运算的结果也是高精度的值
//      2.对于直接出现在程序中的整数，Java会当做int类型的处理；对于浮点数，java会当做double处理