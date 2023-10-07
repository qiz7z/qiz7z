package com.coder;

import java.io.File;
import java.io.IOException;

public class TestFileOthers {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\平凡的世界\\aa\\bb\\hello.txt");
        //获取文件名
        System.out.println("file.getName() = " + file.getName());
        //获取上级目录名
        System.out.println("file.getParent() = " + file.getParent());
        //获取hello.txt所在的目录
        File parentFile = file.getParentFile();
        System.out.println("parentFile.getName() = " + parentFile.getName());
        //获取文件的大小
        System.out.println("file.length() = " + file.length());
        //设置文件只读
        //file.setWritable(false);
        //测试应用程序是否可执行
        System.out.println("file.canExecute() = " + file.canExecute());
        //测试应用程序是否可读
        System.out.println("file.canRead() = " + file.canRead());
        //测试应用程序是否可写
        System.out.println("file.canWrite() = " + file.canWrite());


        file.createNewFile();
        //获取文件路径,获取的是file类构造方法给的路径
        System.out.println("file.getPath() = " + file.getPath());
        //获取绝对路径
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        //获取精准绝对唯一的路径，可以去除在构造时给的相对路径的.
        System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());

        //获取文件的最后修改时间
        /*long l = file.lastModified();
        System.out.println("l = " + l);*/
    //获取磁盘空间的操作
        //获取磁盘总容量
        /*long totalSpace = file.getTotalSpace();
        System.out.println("totalSpace = " + totalSpace);*/
        //获取可用分区大小
        /*long freeSpace = file.getFreeSpace();
        System.out.println("freeSpace = " + freeSpace);*/
        //获取JVM可用空间大小
       /* long usableSpace = file.getUsableSpace();
        System.out.println("usableSpace = " + usableSpace);*/
        //获取所有磁盘分区
        /*File[] files = File.listRoots();
        for (File file1 : files) {
            System.out.println(file1);
            System.out.println(file1.getTotalSpace());
        }*/
    //对文件的命名,可以将文件放到其他目录或盘符下
        //可以实现文件的剪切工作
        /*boolean b = file.renameTo(new File("E:\\平凡的世界\\aa\\bb\\hello.txt"));
        System.out.println("b = " + b);*/
        //判断文件是不是隐藏文件
        boolean hidden = file.isHidden();
        System.out.println(hidden);
    }
}
