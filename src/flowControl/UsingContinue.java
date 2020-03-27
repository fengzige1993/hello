package flowControl;

public class UsingContinue {
    public static void main(String[] args){
        for (int times = 0;times < 5;times ++){
            if (times == 2){
                continue;
            }
            System.out.println("times的值为："+times);
        }
    }
}
// continue 关键字的语义就是结束本次代码块的执行，进行下一个循环条件，也就是执行到continue语句后会马上跳转到循环的开始

//        times的值为：0
//        times的值为：1
//        times的值为：3
//        times的值为：4
//
//        Process finished with exit code 0