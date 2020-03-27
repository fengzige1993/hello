package com.javaeasy.innerclass;

public class UseInnerClassOutside {  //外部类
    private int variable=6;    //成员变量
    public int getVariable(){ //外部类中的方法
        return  variable;
    }

    //内部类
    public class InnerClass{
        private  int variable =5;
        public int getVariable(){
            return variable;
        }
    }

    //静态内部类
    public static class StaticInnerClass{
        private int variable =5;
        public  int getVariable(){
            return variable;
        }
    }
}
