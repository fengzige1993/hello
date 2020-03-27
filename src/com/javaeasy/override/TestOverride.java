package com.javaeasy.override;

/**
 * 首选对于ParentClass的对象调用test()方法，因为是ParentClass对象，去调用test()方法，所以test()内的方法都会被执行
 * 对于使用SubClassInSamePkg的对象调用父类中test()方法，因为privateMethod（）方法，只对本类中的方法可见，所以
 * 子类继承不到，不能对其进行覆盖（重写），所以调用的是父类中的方法
 *  对于SubClassDiffPkg的对象调用父类中test()方法，因为是在不同的包中，privateMethod()方法 和 defaultMethod()方法对于
 * 子类是不可见的，所以子类不能够对其进行重写（覆盖）。所以调用test()方法会执行父类中的方法
 */

import com.javaeasy.override.diffpkg.SubClassInDiffPkg;

public class TestOverride {
    public static void main(String[] args){
        System.out.println("===========使用ParentClass的对象调用test()方法===========");
        ParentClass test = new ParentClass();
        test.test();

        System.out.println("===========使用SubClassInSamePkg的对象调用test()方法======");
        SubClassInSamePkg subSame = new SubClassInSamePkg();
        subSame.test();

        System.out.println("===========使用SubClassDiffPkg的对象调用 test()方法=======");
        SubClassInDiffPkg subDiff = new SubClassInDiffPkg();
        subDiff.test();
    }
}

//===========使用ParentClass的对象调用test()方法===========
//        这是类ParentClass中的privateMethod()方法
//        这是类ParentClass中的defaultMethod()
//        这是类ParentClass中的protectedMethod()方法
//        这是类ParentClass中的publicMethod()方法
//        ===========使用SubClassInSamePkg的对象调用test()方法======
//        这是类ParentClass中的privateMethod()方法
//        这是类SubClassInSamePkg中的defaultMethod()方法
//        这是类SubClassInSamePkg中的protectedMethod()方法
//        这是类SubClassInSamePkg中的publicMethod()方法
//        ===========使用SubClassDiffPkg的对象调用 test()方法=======
//        这是类ParentClass中的privateMethod()方法
//        这是类ParentClass中的defaultMethod()
//        这是类SubClassInDiffpkg中的protectedMethod()方法
//        这是类SubClassInDiffPkg中的publicMethod()方法

//首选对于ParentClass的对象调用test()方法，因为是ParentClass对象，去调用test()方法，所以test()内的方法都会被执行
//对于使用SubClassInSamePkg的对象调用父类中test()方法，因为privateMethod（）方法，只对本类中的方法可见，所以
//子类继承不到，不能对其进行覆盖（重写），所以调用的是父类中的方法
// 对于SubClassDiffPkg的对象调用父类中test()方法，因为是在不同的包中，privateMethod()方法 和 defaultMethod()方法对于
//子类是不可见的，所以子类不能够对其进行重写（覆盖）。所以调用test()方法会执行父类中的方法