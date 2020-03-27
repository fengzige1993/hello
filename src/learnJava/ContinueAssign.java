package learnJava;

public class ContinueAssign {
    public static void main(String[] args) {
        int a = 0;
        int b = (a = 5);
        System.out.println(a);
        System.out.println(b);
    }
}
