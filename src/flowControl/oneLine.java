package flowControl;

public class oneLine {
    public static void main(String[] args){
        int a = 9;
        if(a > 0){
            System.out.println("if语句代码块执行了");
        }
    }
}
//即使if语句的代码块只有一个语句，甚至没有任何语句，也要使用大括号，这样会让程序看起来更容易理解，而且不容易出错
