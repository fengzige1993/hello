package flowControl;

public class UsingBreakInWhileTrue {
    public static void main(String[] args){
        int biggerThan = 10051005;
        int n = 0;
        int squareSum = 0;
        while(true) {
            int square = n * n;
            squareSum = squareSum + square;
            if (squareSum > biggerThan){
                break;
            } else {
                n++;
            }
        }
        System.out.println("平方和大于"+biggerThan+"的最小整数值为："+n);
    }
}
//此时，此刻我就想说一句，他奶奶的对于不知道循环次数的，还是用while简单啊！易理解！
//找出一个最小值n,是得不等式 ：0² + 1² + 2² + 3² ...... + n² > 10051005 成立