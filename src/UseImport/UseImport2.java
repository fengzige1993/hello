package UseImport;
/*
 * 普通的注释不会被视为javadoc
 */
/**
 * 这里就是javadoc注释，放在类的前面可以用来描述类的内容
 * 这些描述可以用来生成Javadoc
 */
import common.*;
public class UseImport2 {
    /**
     * 放在成员变量前面可以用来解释成员变量的作用
     */
    int property;
    Car refToCommonDotCar = new Car();
    RaceCar refToCommonDotRaceCar = new RaceCar();
    /**
     * 放在方法前面可以用来对方法添加 JavaDoc
     */
    public void testJavadoc(){
    }
    public void testCommonComment(){
    }
    /**L
     * 放在构造方法的前面可以用来说明构造函数
     */
    public  UseImport2(){
    }
}
















