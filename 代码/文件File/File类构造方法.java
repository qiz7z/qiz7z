package com.coder;

import java.io.File;

public class Test {
    public static void main(String[] args) {
    //第一种构造方法
        //磁盘上的文件夹->目录
        File file=new File("E:\\平凡的世界");
        //磁盘上的文件
        File file1=new File("E:\\平凡的世界\\19.mp4");
    //第二种构造方法
        File file2=new File("E:\\平凡的世界","19.mp4");
        File file3=new File("E:\\平凡的世界","aa");
    //第三种构造方法
        File dir=new File("E:\\平凡的世界");
        File file4=new File(dir,"19.mp4");



    }
}
