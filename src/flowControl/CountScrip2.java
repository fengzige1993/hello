package flowControl;

public class CountScrip2 {
    public static void main(String[] args){
        int totalCost = 800;
        if (totalCost < 100){
            System.out.println("购物金额不足100元，不赠送抵价券");
        } else if (totalCost <= 500){
            System.out.println("购物金额满100元，赠送55元抵价券。");
        } else if (totalCost <= 1000){
            System.out.println("购物券满500元，赠送155元抵价券");
        } else {
            System.out.println("购物券满1000元，赠送500元抵价券");
        }
    }
}
// 对于执行多个条件时，中间用 else if 语句，最后一个else不加条件，直接后面跟大括号内容--和python对比了下，语法含义相同