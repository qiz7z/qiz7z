package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFilereader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("E:\\平凡的世界\\aa\\hello.txt");
        //文件读取
        /*int read = fileReader.read();//每次返回读取一个字符，返回读取到的字符
        while (read!=-1){
            System.out.print((char)read);
            read = fileReader.read();
        }*/
       /* int read;
        while ((read=fileReader.read())!=-1){
            System.out.print((char)read);
        }*/

        /*char[] chars=new char[1024];
        int read = fileReader.read(chars);//将字符存入到数组中，并返回一共读取到多少字符
        System.out.println(read);
        String str=new String(chars,0,read);
        System.out.println(str);*/


        char[] chars=new char[1024];
        fileReader.skip(4);//跳过前4个数据
        int read = fileReader.read(chars, 0, 12);
        System.out.println(read);
        String str=new String(chars,0,read);
        System.out.println(str);

    }
}
