package leanArray;

public class ArrayAssign {
    public static void main(String[] args){
        int[] arrayA = new int[1];
        arrayA[0] = 1005;
        int[] arrayB = new int[1];
        arrayB[0] = 1985;
        arrayA = arrayB;
        System.out.println("arrayA的第一个元素为："+arrayA[0]);
        System.out.println("arrayB的第一个元素为："+arrayB[0]);
        arrayB[0] = 9999;
        System.out.println("arrayB[0]=9999;执行完毕");
        System.out.println("arrayA的第一个元素为："+arrayA[0]);
        System.out.println("arrayB的第一个元素为："+arrayB[0]);
    }
}
//
//        arrayA的第一个元素为：1985
//        arrayB的第一个元素为：1985
//        arrayB[0]=9999;执行完毕
//        arrayA的第一个元素为：9999,,,,,,,,,,,,,,
//        arrayB的第一个元素为：9999

//当arrayA = arrayB执行完毕后，arrayB的数组的实体已经是一个不能够再访问的数组了，因为想要操作一个数组实体，必须要有一个
//数组变量指向这个数组实体。也就是说永远丢失了arrayA数组的实体，不可能再找回来了。
//所以在数组赋值之后，arrayA和arrayB是指向同一个数组实体，arrayB[0] = 9999;给数组元素赋值，
//所以 arrayA和arrayB的元素值都为9999