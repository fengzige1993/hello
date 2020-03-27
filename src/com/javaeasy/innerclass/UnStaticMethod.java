package com.javaeasy.innerclass;

/**
 * 非静态方法中的局部内部类
 */
public class UnStaticMethod {
    private int variableInClass = 2;
    private static int staticVariableInClass = 1;  //静态成员变量

    public void method(){
        final int variableInMethod = 3;
        //局部内部类。访问控制符不能修饰局部内部类
        class InUnstaticMethod{
            public int variableInner= 4;
            public void innerMethod(){
                int innerMethodVariable = 5;
                System.out.println("内部类InUnStaticMethod中innerMethod()方法里的局部变量："+innerMethodVariable);
                System.out.println("内部类InUnStaticMethod中的成员变量："+variableInner);
                System.out.println("外部类中method()方法中的variableInMethod变量："+variableInMethod);
                System.out.println("外部类中UnStaticMethod的对象中的成员变量："+UnStaticMethod.this.variableInClass);
                System.out.println("外部类UnStaticMethod的静态变量staticVariableInClass:"+UnStaticMethod.staticVariableInClass);

            }
        }
    }

}
