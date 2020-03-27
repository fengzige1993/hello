package learnJava;

public class UsingChar {
    public static void main(String[] args) {
        char charA;
        charA = 'A';
        char charB;
        charB = '人';
        System.out.println(charA);
        System.out.println(charB);
        char charC = '人';
        boolean equal = (charB == charC);
        System.out.println(equal);
    }
}