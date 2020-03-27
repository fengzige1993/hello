package leanArray;

public class FindBiggest {
    public static void main(String[] args){
        int arraySize = 55;
        int[] students = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            students[i] = i + 1;
        }
        int biggest = 0;
        for (int i = 0; i < arraySize; i++){
            if (biggest <= students[i]){
                biggest = students[i];
            }
        }
        System.out.println("全班最高分是："+biggest);
    }
}
//获取一个班级有50人的成绩，并找到最高分
//用for循环对数组进行遍历，并给数组students赋值，i的初始值是0，符合数组下标从0开始的规则
//再用一个for循环遍历数组，创建一个int变量biggest与每个数组进行比较,再用if条件判断最大值，如果 biggest <= students[i]
//就把students[i]的值赋给 biggest.这样当遍历完之后，biggest就是最大值，