package learnClassAndObject;

public class PrintDriverProps2 {
    public static void main(String[] args){
        Driver driver = null;
        System.out.println(driver.age);
        System.out.println(driver.name);
        System.out.println(driver.car);
    }
}
//
//    Exception in thread "main" java.lang.NullPointerException
//        at learnClassAndObject.PrintDriverProps2.main(PrintDriverProps2.java:6)

//1.当我们尝试去操作值为 null的引用时。其实就是让计算机去访问不存在的东西，
//2.NullPointerException 这种错误就是我们尝试使用值为null的引用去操作一个不存在的对象
