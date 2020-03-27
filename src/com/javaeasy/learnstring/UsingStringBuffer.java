package com.javaeasy.learnstring;

public class UsingStringBuffer {
    public static void main(String[] args){
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(true);
        strBuffer.append("test");
        strBuffer.append('\t');
        for (int i = 0; i < 3; i++){
            strBuffer.append(i);
        }
        String str = strBuffer.toString();  //用StringBuffr生成想要的内容，然后将内容转换为String对象使用是一种典型的做法
        //所以String 和 StringBuffer是一对最佳搭档

        System.out.println("打印添加的字符串："+str);
        //插入字符
        strBuffer.insert(1,"插入字符");
        str = strBuffer.toString(); //调用方法得到strBuffer里的字符串；
        System.out.println(str);
        //删除字符串从第0位开始到第三位（左取右不取，右边取不到）
        strBuffer.delete(0,4);      //删除指定索引里的字符
        str = strBuffer.toString();
        System.out.println(str);
        //StringBuffer里的replace()方法，从第几位开始到第几位结束，后面是要替换的字符串
        strBuffer.replace(0,1,"替换");
        str = strBuffer.toString();
        System.out.println(str);
        //reverse()翻转字符
        strBuffer.reverse();
        str = strBuffer.toString();
        System.out.println(str);
    }
}

//        truetest	012
//        t插入字符ruetest	012
//        符ruetest	012
//        替换ruetest	012
//        210	tseteur换替
