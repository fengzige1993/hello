package com.javaeasy.innerclass;

public class DuplicatedName {
    //外部类 DuplicatedName 的成员变量
    private int variable = 5;

    //内部类
    class InnerClass{
        //内部类中的成员变量
        private int variable =7;
        public int useOutVariable(){
            //通过 DuplicatedName.this 解决变量名冲突的问题
            return variable + DuplicatedName.this.variable;
        }
    }
}
