package com.javaeasy.innerclass;

public class UseInnerVariable {

    public class InnerClass{
        private int variable = 5;
    }

    public int useVariableOfInner(){
        InnerClass inner = new InnerClass();
        return inner.variable;
    }
}
