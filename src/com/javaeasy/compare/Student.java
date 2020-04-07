package com.javaeasy.compare;

/**
 * eauals()方法的对象比较
 */

public class Student {
    private String name;
    private int number;

    public Student(String name,int number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public boolean equals(Object objStu){
        if(!(objStu instanceof Student)){
            return false;
        }
        Student other = (Student) objStu;
        return (name.equals(other.name)) && (number== other.number);
    }
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + number;
        return result;
    }
}
