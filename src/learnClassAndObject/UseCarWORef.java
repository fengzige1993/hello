package learnClassAndObject;

public class UseCarWORef {
    public static void main(String[] args){
        String direction = (new Car()).direction;
        System.out.println("Car类对象的direction值为："+direction);
    }
}
