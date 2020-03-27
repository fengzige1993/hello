package leanArray;

public class MultiNameArray {
    public static void main(String[] args){
        int[] students = new int[5];
        students[0] = 55;
        students[1] = 66;
        students[2] = 77;
        students[3] = 88;
        students[4] = 99;
        int[] studentsSame;
        studentsSame = students;
        System.out.println("第1位学生的分数是："+studentsSame[0]);
        System.out.println("第3位学生的分数是："+studentsSame[2]);
        System.out.println("第5位学生的分数是："+studentsSame[4]);
        System.out.println("students数组第1位学生的分数是："+students[0]);
        System.out.println("students数组第5位学生的分数是："+students[4]);
    }
}

//        第1位学生的分数是：55
//        第3位学生的分数是：77
//        第5位学生的分数是：99
//        students数组第1位学生的分数是：55
//        students数组第5位学生的分数是：99