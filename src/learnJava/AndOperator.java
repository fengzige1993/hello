package learnJava;
/**
 *boolean数据类型的与运算符（&&）
 * Created by feng.hu 2019/6/15
 */
public class AndOperator {
    public static void main(String[] args) {
        //创建4 个boolean变量，首次创建变量（前面加数据类型）并赋值，之后就是单个的变量
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean value = false;
        value = a && b;
        //计算a与b的值，都为真为真，一个为假为假，把结果赋值给变量value
        System.out.println(value);
        value = a &&  c;
        System.out.println(value);
    }
}
