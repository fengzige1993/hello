package learnJava;

public class ForceConvert {
    public static void main(String[] args) {
        double doubleValue = 9.4;
        int intValue = 0;
        intValue = (int)(doubleValue + 0.5);
        System.out.println(intValue);
    }
}

// 如果doubleValue变量的小数位小于0.5时，进行算数运算时，不会四舍五入，取整数位