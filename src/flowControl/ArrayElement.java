package flowControl;

public class ArrayElement {
    public static void main(String[] args){
        int[] intArray = new int[1];
        byte byteValue = 55;
        intArray[0] = byteValue;
        System.out.println("int 数组 intArray中的第一个元素值为："+intArray[0]);
    }
}
//数组中的元素只能是同一种类型
//对于基本类型的数组。声明数组的时候使用的类型和创建的数组的类型必须一致。