package flowControl;

public class SelfIncreaseCompare {
    public static void main(String[] args){
        int a = 5;
        int b = 5;
        int c = 5;
        boolean ac = (a++ > c); //程序会首先执行 a > c这个运算，因为a和c的值都是5，所以a > c 的运算的结果是 false并赋值给ac,运算完毕后，a的值加1
        System.out.println(a); //  6
        System.out.println(ac); //false
        boolean bc = (++b > c); // ++b会首先被执行，所以b的值就是6 > C ,所以bc的值为true
        System.out.println(b);  // 6
        System.out.println(bc); //true
    }
}

//        E:\123\JDK8.1\jdk-8u171-windows-x64\bin\java.exe
//        6
//        false
//        6
//        true
//
//        Process finished with exit code 0
