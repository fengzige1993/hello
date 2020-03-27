package learnClassAndMethod;

public class TestThis {
    public static void main(String[] args){
        SimpleClassToShowThis simple = new SimpleClassToShowThis ();
        simple.test();   //调用 test方法
        System.out.println("simple对象中a的值为："+simple.a);
    }
}
