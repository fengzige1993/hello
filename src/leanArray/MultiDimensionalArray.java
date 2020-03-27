package leanArray;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][][] allStudents = new int[5][25][55];
        allStudents[0][1][5] = 85;
        System.out.println("已通过代码赋值的元素值："+allStudents[0][1][5]);
        System.out.println("没有通过代码赋值的元素值："+allStudents[1][1][5]);
    }
}
//        运行结果：
//        已通过代码赋值的元素值：85
//        没有通过代码赋值的元素值：0