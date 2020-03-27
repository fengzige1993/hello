package learnJava;

public class ForceConvert2 {
    public static void main(String[] args) {
        byte byteValue = 0;
        int intValue = 999;
        byteValue = (byte)intValue;
        System.out.println(byteValue);
    }
}

//byte的值域是[-128,127],如果高精度的 intValue 值为999的时候，转为低精度的byteValue值时结果会出现负值，
//所以如果一个高进度的值转为一个低精度值时，需保证这个高精度变量的值没 有超出低精度类型的值域。否则结果出现负值，达不到预期结果