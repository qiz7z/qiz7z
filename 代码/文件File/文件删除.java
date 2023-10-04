package com.coder;

import java.io.File;
import java.io.IOException;

public class FileContextDelete {
    public static void main(String[] args) throws IOException {
        //删除成功返回true，否则返回false
        File file=new File("E:\\平凡的世界\\a.txt");
        file.createNewFile();
        //调用完之后立马删除
        /*boolean delete = file.delete();
        System.out.println(delete);*/
        //不会立马删除，直到虚拟机退出才删除
        /*file.deleteOnExit();*/
        //创建临时文件
        File tempFile = File.createTempFile("aa", "txt");
        tempFile.deleteOnExit();//后面还是可以操作，直到虚拟机结束才会删除
        System.out.println("tempFile.getAbsolutePath() = " + tempFile.getAbsolutePath());
    }
}
