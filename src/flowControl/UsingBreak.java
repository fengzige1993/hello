package flowControl;

public class UsingBreak {
    public static void main(String[] args){
        for (int times = 0; times < 5; times ++){
            if (times == 2){
                break;
            }
            System.out.println("times的值为："+times);
        }
    }
}

// break 结束整个循环
//        times的值为：0
//        times的值为：1
//
//        Process finished with exit code 0
