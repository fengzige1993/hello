package flowControl;

public class UseArray {
    public static void main(String[] args){
        int[] students = new int[5];
//        students[0] = 55;
//        students[1] = 66;
//        students[2] = 77;
//        students[3] = 88;
//        students[4] = 99;
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println("第1位学生的分数是："+students[0]);
        System.out.println("第3位学生的分数是："+students[2]);
        System.out.println("第5位学生的分数是："+students[4]);
    }
}
// E:\123\JDK8.1\jdk-8u171-windows-x64\bin\java.exe
//        0
//        0
//        0
//        第1位学生的分数是：0
//        第3位学生的分数是：0
//        第5位学生的分数是：0
//1. int[] students = new int[5]；  students数组大小是5，意思是数组里有5个元素，
//2. 数组下标也叫做数组索引，数组下标是从0开始的，所以students数组的合法下标是 0 到 4，这个合法的范围就是数组的边界
//3. 数组下标是从0 开始，所以一个数组的最大合法下标是数组大小减一
//4. 可以看出，打印出的元素值是0，所以Java在创建数组的时候，会按照数组元素的数据类型给其中的每个元素赋初始值
