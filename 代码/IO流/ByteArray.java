package com.coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestByteArray {
    public static void main(String[] args) throws IOException {
        /*String str="abcdefg";
        byte[] bytes=str.getBytes(StandardCharsets.UTF_8);
        ByteArrayInputStream bais=new ByteArrayInputStream(bytes);
        int i=bais.read();
        System.out.println((char)i);//a
        int i1=bais.read();
        System.out.println((char)i1);//b
        bais.mark(1000);
        int i2=bais.read();
        System.out.println((char)i2);//c
        int i3=bais.read();
        System.out.println((char)i3);//d
        bais.reset();
        int i4=bais.read();
        System.out.println((char)i4);//c*/

        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        while(baos.size()!=10){
            baos.write(System.in.read());
        }
        byte[] b=baos.toByteArray();
        /*for (byte b1 : b) {123456789
            System.out.println((char)b1);
        }*/

        /*String s=new String(b);
        System.out.println(s);*/

        /*String s= baos.toString();
        System.out.println(s);*/

        ByteArrayInputStream bs=new ByteArrayInputStream(b);
        int x;
        while ((x=bs.read())!=-1)
            System.out.println((char)x);
    }
}
