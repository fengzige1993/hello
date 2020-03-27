//package com.javaeasy.usemap;
//
//import java.util.HashMap;
//import java.util.Map;
//import com.javaeasy.compare.Stuents;
//import com.javaeasy.genericstypes.NoGenericsTypes;
//import com.javaeasy.learnabstractclass.Student;
//
//public class UseMap {
//    public static void main(String[] args){
//        //创建一个HashMap实例
//        Map students = new HashMap();
//        Student stu1 = new Student("刘伟",1);
//        Student stu2 = new Student("成秋",1);
//
//        students.put(stu1.getName(),stu1);
//        students.put(stu2.getName(),stu2);
//        String stuName = "成秋";
//        Student findStu = (Student) students.get(stuName);
//        NoGenericsTypes.printStudentProps(findStu);
//    }
//}
