package com.javaeasy.threadsleep;

/**
 * 一个测试例程，来测试前面写的功能类
 */
public class TestAddingMain {
    public static void main(String[] args){
        //通过匿名类创建Runnable的实例
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TestAdding adding = new TestAdding();
                adding.giveAddingTest();
            }
        };
        //使用runnable 创建一个线程实例，名字是"加法测试线程"
        Thread thread = new Thread(runnable,"加法测试线程");
        thread.start();
        System.out.println("主线程结束了");
    }
}

//        主线程结束了
//        请在5秒内计算出下面两个整数的和：99+95
//        执行当前代码的线程名叫做：加法测试线程
//        99+95的运算结果为：194