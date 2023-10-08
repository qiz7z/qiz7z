package com.coder;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestInputOutput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("e:\\aa\\hello.txt");//字节流,用于读取二进制的文件，当读取字符流时会产生乱码,//GBK 2个字节 UTF-8 3个字节
        /*int read = fis.read();
        System.out.println((char)read);*/
        //当读到文件尾。会返回一个-1
        //GBK 2个字节 UTF-8 3个字节
        //转换成Reader
        InputStreamReader isr=new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*int read;
        while ((read=isr.read())!=-1){
            System.out.print((char)read);
        }
        fis.close();*/
        BufferedReader bufferedReader=new BufferedReader(isr);
        String str;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
