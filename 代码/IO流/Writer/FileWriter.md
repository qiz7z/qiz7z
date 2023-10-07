字符流实现原理：字节流+编码表

字符集：unicode字符集 UTF-8、UTF-16、UTF-32、GB2312、GBK、GB18030

使用FileWriter将字符串写入磁盘文本文件

package io;

import java.io.*;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        //try with resource会自动关闭
        try(FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\hello.txt")) {
            for (int i = 0; i < 10000; i++) {
                writer.write(i + "\t");
            }
        }
        /*FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\hello.txt");
        writer.write("欢迎你啊！");
        writer.flush();//之后还可以写文件
        writer.write("\n");
        writer.write("helllo,java");
        writer.flush();
        writer.close();//之后就不能在写文件了*/
    }
}
//不管是读文件、还是写文件，操作步骤
//打开流
//读、写文件
//关闭流



package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TestFileWirter {
    public static void main(String[] args) throws IOException {
        //构造方法1
        //FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\hello.txt");
        //构造方法2
        //FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\hello.txt",true);
        //构造方法3
        /*File file=new File("E:\\平凡的世界\\aa\\hello.txt");
        FileWriter writer=new FileWriter(file);*/
        //构造方法4
       /* File file=new File("E:\\平凡的世界\\aa\\hello.txt");
        FileWriter writer=new FileWriter(file,true);*/
        //构造方法5
        FileWriter writer=new FileWriter("E:\\平凡的世界\\aa\\hello.txt", StandardCharsets.UTF_8);

        //writer.write('好');
        //char[] cahrs={'河','科','大'};
        //writer.write(cahrs);
        //writer.write(cahrs,0,1);
        String str="按时出发";
        writer.write(str,0,4);
        writer.close();
    }
}
