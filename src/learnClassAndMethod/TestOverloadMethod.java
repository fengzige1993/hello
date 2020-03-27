package learnClassAndMethod;

public class TestOverloadMethod {
    public static void main(String[] args){
        CarOverload carOL = new CarOverload();
        carOL.raiseSpeed(9999);
        System.out.println("调用签名为：raiseSpeed(int)的加速方法，现在车速为："+carOL.speed);
        carOL.speed = 0;
        carOL.raiseSpeed(9999,80);
        System.out.println("调用签名为raiseSpeed(int,int)的加速方法，现在的车速为："+carOL.speed);

    }
}
