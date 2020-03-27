package flowControl;

public class endlessloop {
    public static void main(String[] args){
        int times = 0;
        for(;;){                  //没有条件表达式，则不做任何判断进行循环，可以看出for循环就会陷入死循环
            System.out.println(times);
            times ++;
        }
    }
}
