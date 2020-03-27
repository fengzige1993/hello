package flowControl;

public class DefaultValueofArrayElements {
    public static void main(String[] args){
        int[] intArray = new int[1];
        double[] doubleArray = new double[1];
        char[] charArray = new char[1];
        boolean[] booleanArray = new boolean[1];
        System.out.println("int数组中元素的默认值是："+intArray[0]);
        System.out.println("double数组中元素的默认值是："+doubleArray[0]);
        System.out.println("char数组中元素的默认值是："+charArray[0]);
        System.out.println("boolean数组中元素的默认值是："+booleanArray[0]);
    }
}

//        int数组中元素的默认值是：0
//        double数组中元素的默认值是：0.0
//        char数组中元素的默认值是：
//        boolean数组中元素的默认值是：false