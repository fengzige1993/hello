package leanArray;

public class MultiDimArrayUsage {
    public static void main(String[] args){
        int[][] gradeStudents = new int[2][5];
        int[] classOne;
        classOne = gradeStudents[0];
        classOne[0]= 88;
        System.out.println("第一班第一个学生的成绩："+gradeStudents[0][0]);
        int[] classTwo = new int[6];
        classTwo[5] = 99;
        gradeStudents[1] = classTwo;
        System.out.println("第2班第6个学生的成绩是："+gradeStudents[1][5]);
    }
}


//        第一班第一个学生的成绩：88
//        第2班第6个学生的成绩是：99