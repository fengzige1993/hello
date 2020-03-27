package learnClassAndMethod;

public class SimpleClassToShowThis {
    public int a;
    public void test(){
        int a = 50;
        this.a = this.countArea(a);       //this 关键字只能在方法中使用，是用来指代调用方法的类的对象的。只有出现局部变量和实例变量重名的情况下，才会有使用this变量的必要。
        System.out.println("正方形的面积："+this.a);
    }

    public int countArea(int circumference){
        int sideLength = circumference;
        int area = sideLength * sideLength;
        return area;
    }
}

