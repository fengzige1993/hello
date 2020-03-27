package com.javaeasy.accessMethod;

public class AccessMethods {

    public void publicMethod(){//使用Public修饰的代码

    }

    public void usingMethods(){
        this.publicMethod(); //使用 this关键字调用本类中pulicMethod方法
        this.protectedMethod();//使用this关键字调用本类中protected的方法
        this.defaulMethod(); //使用this关键字调用本类中的默认控制符的方法
        this.privateMethod();   //使用this关键字调用本类中private的方法
    }

    void defaulMethod(){//使用默认修饰符修饰的方法

    }

    protected void protectedMethod(){//使用protected修饰的方法

    }

    private void privateMethod(){//使用private修饰的方法

    }

}
