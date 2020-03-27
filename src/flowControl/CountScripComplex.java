package flowControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountScripComplex {
  public static void main(String[] args) throws IOException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int serverTimes = 0;
      int totalCost = 0;
      int hasMoreGoods= 0;
      System.out.println("请输入结账员需要接待的顾客次数：");
      serverTimes = Integer.parseInt(reader.readLine());
      for (int i = 0; i < serverTimes; i++){
          totalCost = 0;
          do {
              System.out.println("请输入商品的单价：");
              int price = Integer.parseInt(reader.readLine());
              if (price < 0){
                  System.out.println("商品单价不能小于0！");
                  hasMoreGoods = 1;
                  continue;
              }
              System.out.println("请输入商品的数量：");
              int amount = Integer.parseInt(reader.readLine());
              if (amount < 0){
                  System.out.println("商品数量不能小于0！");
                  hasMoreGoods = 1;
                  continue;
              }
              totalCost = totalCost + price * amount;
              System.out.println("当前总价为：" +totalCost);
              System.out.println("还有商品需要结算吗(输入数字1为有，其他数字为没有)?");
              hasMoreGoods = Integer.parseInt(reader.readLine());
          } while(hasMoreGoods == 1);
          System.out.println("本次消费金额为：" +totalCost);
          System.out.println("======谢谢光临，欢迎下次再来！=======");
      }
      System.out.println(serverTimes +"次结算已经结束，结账员可以休息一下啦！");
  }
}

//结账员-模拟超市结账程序
//1.do while 其实就是在等待某个条件，一旦条件成立，就去执行。一旦条件不成立，程序就退出循环
//2.BufferedReader && InputStreamReader 构造read函数
//3.IOException 丢弃异常
//4.Integer.parseInt(reader.readLine())获取用户输入的值，作用就是从控制台读取用户输入的值，并且将这个输入的字符串转换为int值