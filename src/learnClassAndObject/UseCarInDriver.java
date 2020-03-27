package learnClassAndObject;

public class UseCarInDriver {
    public static void main(String[] args){
        Driver driver = new Driver();
        driver.car = new Car();
        System.out.println("driver对象中car对象的name属性值为："+driver.car.name);
    }
}
