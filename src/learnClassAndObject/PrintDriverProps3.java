package learnClassAndObject;

public class PrintDriverProps3 {
    public static void main(String[] args){
        Driver driver = new Driver();
        System.out.println(driver.age);
        if (driver.name != null){
            System.out.println("司机的名字为："+driver.name);
        } else {
            System.out.println("没有司机的名字");
        }
        if (driver.car != null){
            System.out.println("司机的车的信息为："+driver.car);
        } else{
            System.out.println("没有司机的车的信息");
        }
    }
}
