package com.javaeasy.property;

/**
 * 多线程环境（存钱取钱的问题）
 */
public class BankAccount {
    private int money = 0;
    public void getMoneyOutOfBank(int cash){
        if (cash <= 0){
            System.out.println("取钱的数额必须大于0");
            return;
        }
        if (money < cash){
            System.out.println("现金不足！");
            return;
        }
        System.out.println("正在处理，请稍后......");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
            return;
        }
        money = money - cash;
        System.out.println("取钱成功，请拿好现金："+cash+"元。现在账户余额为："+money +"元");
    }
    public void putMoneyToBank(int cash){
        if (cash <= 0){
            System.out.println("存钱的数额必须大于0");
            return;
        }
        System.out.println("正在处理存钱操作，请稍后......");
        int tempMoney = money + cash;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println("对不起，程序运行出错，错误信息为："+e.getMessage());
            return;
        }
        money = tempMoney;
        System.out.println("存钱成功，金额为："+cash+"元。现在账户余额为："+money+"元。");
    }
    public void peekMoney(){
        System.out.println("现在账户的余额为："+money+"元。");
    }
}
