package learnJava;

public class ForceConvert1 {
    public static void main(String[] args) {
        double doubleValue = 9.9;
        int intValue = 0;
//        intValue = (int)doubleValue + 0.5;
//        intValue = 5 + 0.5;
        System.out.println(intValue);
    }
}
// Error:(7, 37) java: 不兼容的类型: 从double转换到int可能会有损失
//1.首先，当操作符的操作数有不同的精度时，java会将低精度的操作数转换为高精度的操作数，然后进行运算，运算的结果也是高精度的值
// 本例中：doubleValue强制转换为int变量，0.5是一个double变量，所以是一个int和double变量的加法运算
//所以当操作符两边的操作数是不用的精度时，Java会将低精度的操作数转为高精度的操作数，然后进行运算，所以(int)doubleValue会转为
//一个高精度的double变量，所以 （int）doubleValue + 0.5 的运算结果是一个高精度的double变量
//"intValue = (int)doubleValue + 0.5;"其实是将一个double的值赋给一个int变量,所以会报错
