package com.coder;

import java.io.File;
import java.io.IOException;

public class FileAndContext {
    public static void main(String[] args) {
    //常用方法
        //创建一个新的空文件
            //如果文件不存在则创建一个新的空文件，返回true；若文件不存在，则返回false不会创建新的文件
        /*File file=new File("E:\\平凡的世界\\a.txt");
        try {
            System.out.println("file.createNewFile() = " + file.createNewFile());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        //创建目录
            //如果目录不存在则创建目录，返回true，若存在，则不创建，返回false
            //mkdir如果上级目录不存在则会返回false，例如E:\平凡的世界\dd\cc，这时需要调用另一个方法mkdirs
        File dir=new File("E:\\平凡的世界\\aa\\zz");
       // boolean mkdir = dir.mkdir();
        boolean mkdirs = dir.mkdirs();
        System.out.println("mkdir = " + mkdirs);
    }
}
