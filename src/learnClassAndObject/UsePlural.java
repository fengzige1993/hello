package learnClassAndObject;

public class UsePlural {
    public static void main(String[] args){
        Plural a;
        a = new Plural();
        a.realPart = 5;
        a.virtualPart = 10;
        System.out.println("复数的实部为"+a.realPart);
        System.out.println("复数的虚部为"+a.virtualPart);
    }
}

//首先声明一个Plural类的变量a, 然后创建一个Plual类的对象，这个对象是代表一个实实在在的有值的复数，
//也就是把Plural类的变量a,指向一个Plural类的实体（也就是对象），
//new Plural() 创建一个Plural类的对象，过程可以理解为：java平台会读取Plural类主体中定义的所有属性
//然后分配计算机资源去创建这些属性，并且按照变量的类型赋初始值，最后构成一个符合Plural类的定义的数据整体。
//最后得到的这个整体就是Plural类的对象。
//1.类是定义,是抽象，是一种数据类型；对象是个例，是具体，是具体的数据。
//2.对象是按照类的定义创建的一个实例，

