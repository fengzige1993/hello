//package com.javaeasy.genericstypes;
//
//import java.util.ArrayList;
//import java.util.List;
//import com.javaeasy.compare.Student;
//import com.javaeasy.learnabstractclass.Student;
//
//public class NoGenericsTypes {
//    public static void main(String[] args){
//        //创建一个student类的实例
//        Student stu = new Student("刘伟",1);
//        //创建一个 ArraList的实例，尖括号中的内容是指定此列表中元素的类型
//        List<Student> students = new ArrayList<Student>();
//        //此时Students只能够添加Student类型的元素
//        students.add(stu);
//        //得到一个匀元素因为使用的是泛型，所以无需强制类型转换
//        Student stuFromList = (Student) students.get(0);
//
//        printStudentProps(stuFromList);
//    }
//
//    public static void printStudentProps(Student stu){
//        System.out.println("学生姓名："+stu.getName());
//        System.out.println("学生编号："+stu.getNumber());
//    }
//}
