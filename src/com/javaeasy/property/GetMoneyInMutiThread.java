package com.javaeasy.property;

/**
 * 测试历程取钱方法的问题
 */
public class GetMoneyInMutiThread { //测试历程
    public static void main(String[] args){
        BankAccount account = new BankAccount();//创建银行账户类的实例
        account.putMoneyToBank(100);//存入100块钱
        //创建银3个GetMoney实例，都使用account作为参数，他们会从同一个银行账户取钱
        GetMoney money1 = new GetMoney(account,100);
        GetMoney money2 = new GetMoney(account,100);
        GetMoney money3 = new GetMoney(account,100);
        //使用前面创建的 GetMoney实例，分别创建3个Thread类实例
        Thread moneyThread1 = new Thread(money1,"取钱线程1");
        Thread moneyThread2 = new Thread(money2,"取钱线程2");
        Thread moneyThread3 = new Thread(money3,"取钱线程3");
        //启动这3个线程，因为GetMoney实现了Runnable接口，且实现了其中的 run()方法
        moneyThread1.start();
        moneyThread2.start();
        moneyThread3.start();
    }
}
//可以看到多个线程执行同一个账户会出现负值（可以用同步方法解决）
//正在处理存钱操作，请稍后......
//        存钱成功，金额为：100元。现在账户余额为：100元。
//        线程"取钱线程1"开始取钱！
//        正在处理，请稍后......
//        线程"取钱线程2"开始取钱！
//        正在处理，请稍后......
//        线程"取钱线程3"开始取钱！
//        正在处理，请稍后......
//        取钱成功，请拿好现金：100元。现在账户余额为：0元
//        线程"取钱线程1"取钱完毕！
//        取钱成功，请拿好现金：100元。现在账户余额为：-100元
//        线程"取钱线程3"取钱完毕！
//        取钱成功，请拿好现金：100元。现在账户余额为：-100元
//        线程"取钱线程2"取钱完毕！