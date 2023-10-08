package com.coder;

import java.io.*;
import java.util.Scanner;

public class TestSystemInOut {
    public static void main(String[] args) throws IOException {
        //从键盘接收数据
        //方法1
        /*Scanner scanner=new Scanner(System.in);*/
        //方法2
        /*InputStream inputStream=System.in;
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("please input your name");
        String s = bufferedReader.readLine();
        System.out.println("your name is:");
        System.out.println(s);*/

        //输出流
       /* PrintStream out=System.out;
        out.println("halo");*/
       /* System.err.println("error");
        System.out.println("标准输出");
        int i=1;
        System.out.printf("%2d",i);
        String name="libai";
        int age=20;
        System.out.printf("你好，%s,your age is :%d",name,age);*/
        //将标准输入输出进行扭转
        FileInputStream fis=new FileInputStream("e:/aa/hello.txt");
        System.setIn(fis);//重新设置输入流
        FileOutputStream fos=new FileOutputStream("e:/aa/hhh.txt");
        System.setOut(new PrintStream(fos));//重新分配输出流
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();

    }
}
