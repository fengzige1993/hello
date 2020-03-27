package flowControl;

public class UsingSwitch {
    public static void main(String[] args){
        int goodsNumber = 3;
        switch (goodsNumber){
            case 1:
                System.out.println("此商品属于食品分部");
                break;
            case 2:
                System.out.println("此商品属于食品分部");
                break;
            case 3:
                System.out.println("此商品代码属于百货分部");
                break;
            case 4:
                System.out.println("此商品代码属于百货分部");
                break;
            case 5:
                System.out.println("此商品代码属于百货分部");
                break;
            default:
                System.out.println("无此商品分类别号");
                break;
        }
        System.out.println("Switch语句执行结束。");
    }
}
