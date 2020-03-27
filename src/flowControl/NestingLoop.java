package flowControl;

public class NestingLoop {
    public static void main(String[] args){
        int biggerThan = 10051005;
        int n = 0;
        int squareSum = 0;
        while (squareSum <= biggerThan){
            n++;
            squareSum = 0;
            for (int i = 0; i<= n; i++){
                int squareValue = i * i;
                squareSum = squareSum + squareValue;
            }
        }
        System.out.println("平方和大于"+biggerThan + "的最小整数值为："+n);
        System.out.println(squareSum);
    }
}

//找出一个最小值n,是得不等式 ：0² + 1² + 2² + 3² ...... + n² > 10051005 成立