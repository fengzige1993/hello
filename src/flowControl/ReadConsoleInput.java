package flowControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleInput {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一个数字，然后敲Enter:");
        int valueFromConsole = Integer.parseInt(reader.readLine());
        System.out.println("输入的值为：" +valueFromConsole);
    }
}
