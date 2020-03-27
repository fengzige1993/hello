package flowControl;

public class UsingSwitchSmart {
    public static void main(String[] args){
        int goodsNumber = 3;
        switch (goodsNumber){
            case 1:
            case 2:
                System.out.println("此商品属于食品分部");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("此商品属于百货分部");
                break;
            default:
                System.out.println("无此商品分类别号");
        }
        System.out.println("switch语句执行结束。");
    }
}

//case 语句的条件值必须是一个确定的值，在这里可以认为使用case语句中的条件值必须是一个写在程序中的确定的值，例如整数 5 或 字符A