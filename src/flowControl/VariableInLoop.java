package flowControl;

public class VariableInLoop {
    public static void main(String[] args){
        for (int i = 0; i < 3; i++){
            int variableInLoop =i*i;       //for循环之内创建一个变量
            System.out.println(variableInLoop);
        }
//        System.out.println(variableInLoop); //变量variableInLoop是在上面的for语句中创建的，不能在for语句外面使用
    }
}

//Error:(9, 28) java: 找不到符号
//        符号:   变量 variableInLoop
//        位置: 类 flowControl.VariableInLoop