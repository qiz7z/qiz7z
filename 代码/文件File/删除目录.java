package com.coder;

import java.io.File;

public class ContextDelete {
    public static void main(String[] args) {
        File dir=new File("E:\\平凡的世界\\aa");
        //删除的时候要求是空目录
       /* boolean delete = dir.delete();
        System.out.println(delete);*/
        //获取目录下所有的文件,循环删除
        /*File[] files = dir.listFiles();
        for (File file : files) {
            //System.out.println(file.getName());
            file.delete();
        }*/

        File file=new File("E:\\平凡的世界\\aa\\bb");
        deleteDir(file);

    }
    public static void deleteDir(File dir){
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                //两种情况，，一种是文件，一种是目录
                if (file.isFile()) {//判断是不是文件，isDirectory判断是不是目录
                    file.delete();
                } else {
                    deleteDir(file);
                }
            }
        }
        System.out.println("dir.delete() = " + dir.delete());//删除空目录
    }
}
