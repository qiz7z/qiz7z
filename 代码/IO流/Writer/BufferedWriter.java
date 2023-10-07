package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBuffered {
    //BufferedWriter与FileWriter的区别，前者效率更高
    //都是字节流，FileWriter内部有8192（字节）个缓冲区，BufferedWriter也有8192个（字符，16384个字节缓冲区）缓冲区
    public static void main(String[] args) throws IOException {
        FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\buffer.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("hello,hadoop");
        //换行
        bufferedWriter.newLine();
        //bufferedWriter.write("\n");
        bufferedWriter.write("123456");
        bufferedWriter.close();
    }
}
