package flowControl;

public class VariableOutsideLoop {
    public static void main(String[] args){
        int i = 0;
        int variableOutsideLoop = 0;
        for (i = 0; i < 3;i++){
            variableOutsideLoop = i * i;
            System.out.println(variableOutsideLoop);
        }
        System.out.println(i);                   //变量i和variableOutsideLoop不是在循环语句中创建的，可以在for循环外使用
        System.out.println(variableOutsideLoop);
    }
}
