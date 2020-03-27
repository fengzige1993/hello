package com.javaeasy.writedandread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFromFileUsingStream {
    public static void main(String[] arrs){
        File dataFile = new File("D:\\DataFIleForOutputStream.txt");
        if (dataFile.exists() && dataFile.isFile()){
            System.out.println("从DataFileForOutputStream.txt 中读取数据");
        } else {
            System.out.println("DataFileForOutputStream.txt 文件不存在。");
            return;
        }
        System.out.println("文件中的内容为：");
        try{
            FileInputStream fis = new FileInputStream(dataFile);
            byte[] data = new byte[1024];
            int len = fis.read(data);
            String content = new String(data,0,len);
            System.out.println(content);
            fis.close();
        } catch (FileNotFoundException e){
            System.out.println("找不到文件！错误信息为："+e.getMessage());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
