package com.javaeasy.writedandread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteDataUsingStream {
    public static void main(String[] args){
        File dataFile = new File("D:\\DataFileForOutputStream.txt");
        if (dataFile.exists() && dataFile.isFile()){
            System.out.println("使用已经存在的 DataFileForOutputStream.txt文件");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建 DataFileForOutputStream.txt文件。");
            } catch (IOException e){
                System.out.println("创建DataFileForOutputStream.txt文件失败，错误信息："+e.getMessage());
                return;
            }
        }

        try {
            String content = "通过输出流向文件写入数据。";
            FileOutputStream fos = new FileOutputStream(dataFile);
            byte[] contentBytes = content.getBytes();
            fos.write(contentBytes);
            fos.close();
            System.out.println("数据写入成功。");
        } catch (FileNotFoundException e){
            System.out.println("找不到文件！错误信息为："+e.getMessage());
        } catch (IOException e){
            System.out.println("输出内容出错，错误信息为："+e.getMessage());
        }
    }
}
