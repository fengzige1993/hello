package flowControl;

public class CompatibleValue {
    public static void main(String[] args){
        byte student1 = 55;
        short student2 = 66;
        int student3 = 77;
        student3 = student1;
        System.out.println(student3);
        //可以看出java允许直接将一个低精度的值赋给高精度的变量。
        double student4 = 88.8;
        int[] students = {student1,student2,student3,(int)student4,99};
        //如果需要将一个高精度的值赋给低精度的变量，需要对高精度的值进行强制类型转换。在本次 int数组 students中完美的体现
        System.out.println("第1位学生的分数是："+students[0]);
        System.out.println("第2位学生的分数是："+students[1]);
        System.out.println("第3位学生的分数是："+students[2]);
        System.out.println("第4位学生的分数是："+students[3]);
        System.out.println("第5位学生的分数是："+students[4]);
    }
}

//        第1位学生的分数是：55
//        第2位学生的分数是：66
//        第3位学生的分数是：77
//        第4位学生的分数是：88
//        第5位学生的分数是：99