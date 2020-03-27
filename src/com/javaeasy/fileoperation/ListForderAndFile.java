package com.javaeasy.fileoperation;

        import java.io.File;
        import java.util.ArrayList;
        import java.util.List;

public class ListForderAndFile {
    public static void main(String[] args){
        if (args.length !=1){
            System.out.println("程序需要一个文件夹路径作为参数！");
            return;
        }
        String folderPath = args[0];  //一个参数作为路径
        File folder = new File(folderPath); //创建一个file对象，表示文件夹
        if (!folder.exists()) { //如果文件夹不存在，退出程序
            System.out.println(folderPath + "不是有效的路径！");
            return;
        }
        if (!folder.isDirectory()){
            System.out.println(folderPath+"不是有效的文件夹");
            return;
        }
        File[]  allFiles = folder.listFiles();//得到文件夹中所有的文件和文件夹
        //创建两个List分别保存文件，和文件夹
        List files = new ArrayList();
        List folders = new ArrayList();
        for (int i = 0; i < allFiles.length; i++){
            //是文件则放入文件files中
            if (allFiles[i].isFile()){
                files.add(allFiles[i]);
            }  else {      //否则放入文件夹folders中
                folders.add(allFiles[i]);
            }
        }
        System.out.println("文件夹\"" +folderPath + "\"中包含如下文件夹:");
        printPath(folders);
        System.out.println("文件夹\""+folderPath + "\"中包含如下文件：");
        printPath(files);

    }
    //定义了一个方法，功能是输出这个list中的所有文件夹或文件的名称（把他两抽成一个公共的方法，只对类可见）
    private static void printPath(List list){
        for (int i = 0; i < list.size(); i++){
            File file = (File)list.get(i);
            System.out.println(file.getName());
        }
    }
}


