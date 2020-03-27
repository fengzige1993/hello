package flowControl;

public class SettleAccountUsingDowhile {
    public static void main(String[] args){
        int times = 5;
        do{                 //do-while语句是以do开头
            int price = 5;
            int amount = 10;
            if (price > 0 && amount > 0){
                int totalCost = price * amount;
                System.out.println(totalCost);
            } else{
                System.out.println("price和amount的值必须大于0，否则无法计算totalCost");
            }
            times = times -1;
        }
        while (times > 0);  //do-while语句的条件表达式放在循环体的后面，很明显这是一个java语句结束，所以要用分号（;）结束
        System.out.println("do-while语句执行结束，结账员可以休息了。");
    }
}
