public class TEST {
    public static void main(String[] args) {
        int len = args.length;
        System.out.println("main()方法的参数是：");
        for (int i = 0; i < len; i++) {
            System.out.println(args[i]);
        }
    }
}