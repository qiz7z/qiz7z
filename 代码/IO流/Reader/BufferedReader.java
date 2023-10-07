package io;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        /*FileReader reader=new FileReader("E:\\平凡的世界\\aa\\hello.txt");
        BufferedReader bufferedReader=new BufferedReader(reader);
        //String s = bufferedReader.readLine();//读一行
        //System.out.println(s);
        String str;
        while((str=bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();*/

        //copy(new File("E:\\平凡的世界\\aa\\hello.txt"),new File("E:\\平凡的世界\\aa\\hello1.txt"));

        //copyBuffer("E:\\平凡的世界\\aa\\buffer.txt","E:\\平凡的世界\\aa\\buffer1.txt");
        copyFile("E:\\平凡的世界\\aa\\buffer.txt","E:\\平凡的世界\\aa\\buffer2.txt");
    }
    public static void copy(File src,File des) throws IOException {//复制文件
        FileReader reader=new FileReader(src);
        FileWriter writer=new FileWriter(des);
        int c;
        char[] chars=new char[1024];
        while((c=reader.read(chars))!=-1){//c表示读取了多少个
            writer.write(chars,0,c);
        }
        reader.close();
        writer.close();
    }
    public static void copyBuffer(String src,String des) throws IOException {
        FileReader reader=new FileReader(src);
        FileWriter writer=new FileWriter(des);
        BufferedReader bufferedReader=new BufferedReader(reader);
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        String str;
        while((str=bufferedReader.readLine())!=null){
            bufferedWriter.write(str);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
    public static void copyFile(String src,String des) throws IOException {
        try(FileReader reader=new FileReader(src);
            FileWriter writer=new FileWriter(des);){
            reader.transferTo(writer);//对文件进行复制
        }
    }
}
