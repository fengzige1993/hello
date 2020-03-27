package com.javaeasy.fileoperation;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {
    public static void main(String[] args){
        //文件夹路径
        String folderPath = "C;"+ File.separator  + "javaeasy" + File.separator + "testingfolder";
        String fileName = "testingfile.txt"; //文件名
        File folder = new File(folderPath);    //创建一个File对象，对应文件夹
        if (folder.exists() && folder.isDirectory()){
            //如果文件已经存在，而且是文件夹
            System.out.println("该文件夹已经存在了。");

        } else {
            boolean createFolders = folder.mkdirs();  //如果文件夹不存在，就创建需要的文件夹

            if (createFolders){
                System.out.println("文件夹创建成功");
            } else {
                System.out.println("文件夹创建失败。");
                return;
            }
        }

        //创建一个File对象，对应文件
        File file = new File(folder,fileName);
        //如果文件存在，且正是文件
        if (file.exists() && file.isFile()){
            System.out.println("文件已存在，将文件删除！");
            boolean deleteFile = file.delete();   //删除文件
            if (deleteFile){
                System.out.println("文件删除成功！");
            } else {
                System.out.println("文件删除失败！");
                return;
            }
        }
        //创建文件
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e){
            System.out.println("文件创建失败，错误信息。"+e.toString());
            return;
        }
    }
}
