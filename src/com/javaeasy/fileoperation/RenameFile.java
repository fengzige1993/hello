package com.javaeasy.fileoperation;


import java.io.File;

public class RenameFile {
    public static void main(String[] args){
        if (args.length !=1){
            //检查一个参数是否为一个存在的文件路径
            System.out.println("程序需要一个文件路径作为参数1");
            return;
        }
        String folderPath = args[0];
        File file = new File(folderPath);
        if ( !file.exists()){
            System.out.println(folderPath+"程序不是一个有效的路径！");
            return;
        }
        if (!file.isFile()){
            System.out.println(folderPath+"文件不是有效的文件");
            return;
        }

        File renameFile = new File(file.getParentFile(),"renamedFile");
        if (renameFile.exists()){
            System.out.println("文件已经被占用！");
            return;
        }

        if (file.renameTo(renameFile)){
            System.out.println("文件重命名成功。");
        } else {
            System.out.println("文件重命名失败。");
        }
    }
}
