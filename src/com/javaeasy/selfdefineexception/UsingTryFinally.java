package com.javaeasy.selfdefineexception;

public class UsingTryFinally {
    public static void main(String[] args) throws CapacityTooBigException,CapacityTooSmallException{
        Cup cup =  new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);
        try {
            cupDesigner.designCupCapacity(99999);
        } finally {
            System.out.println("这里是 finaly语句块。");
        }


    }
}
