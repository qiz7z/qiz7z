package com.coder;

import java.io.*;

public class TestCopy {
    public static void main(String[] args) throws IOException {
        copyBuffer(new File("C:\\Users\\liu'qi\\Desktop\\edge浏览器下载地址\\0037058WC68.jpg"),
                new File("e:/aa/x.jpg"));

    }
    public static void copy(File src,File des) throws IOException {
        long l1=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(des);
        int x;
        while((x=fis.read())!=-1){//6436，一个一个字节的读很慢，效率低
            fos.write(x);
        }
        fis.close();
        fos.close();
        long l2=System.currentTimeMillis();
        System.out.println(l2-l1);
    }
    public static void copyBuffer(File src,File des) throws IOException {//加了一个缓冲区
        long l1=System.currentTimeMillis();
        FileInputStream fis=new FileInputStream(src);
        FileOutputStream fos=new FileOutputStream(des);

        BufferedInputStream bis=new BufferedInputStream(fis);//加上buffer处理速度更快，也可以使用transferTo处理
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        byte[] bytes=new byte[1024];//8,效率较高
        int x;
        while((x=bis.read(bytes))!=-1){
            bos.write(bytes,0,x);
        }
        bis.close();
        bos.close();

       /* byte[] bytes=new byte[1024];//8,效率较高
        int x;
        while((x=fis.read(bytes))!=-1){
            fos.write(bytes,0,x);
        }
        fis.close();
        fos.close();*/
        long l2=System.currentTimeMillis();
        System.out.println(l2-l1);
    }
}
