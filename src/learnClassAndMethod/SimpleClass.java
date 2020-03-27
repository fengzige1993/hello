package learnClassAndMethod;

public class SimpleClass {
    public int instanceVariable;
    public void showLocalVariable(){
        int localVariable = 55;
        instanceVariable = localVariable;

    }
    public void anotherMethod(){
//        instanceVariable = localVariable(); // 错误，局部变量 localVariable 不能在声明它的方法外部使用。
     }
}

