package com.javaeasy.property;

/**
 * 取钱方法的问题
 */
public class GetMoney implements Runnable {
    //GetMoney 实现了 Runnable接口
    private BankAccount  account; //银行账户类型的引用
    private int cash;//取钱的数额
    public GetMoney(BankAccount account,int cash){
        this.account = account;
        this.cash = cash;
    }
    public void run(){
        String name = Thread.currentThread().getName();//得到当前线程的名字
        System.out.println("线程\""+name+"\"开始取钱！");
        //调用取钱的方法
        account.getMoneyOutOfBank(cash);
        System.out.println("线程\""+name+"\"取钱完毕！");
    }
}
