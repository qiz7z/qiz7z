package com.coder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestStudent {
    public static void main(String[] args) throws IOException {
        Student student=new Student("apple","man",23,"china");
        FileOutputStream fos=new FileOutputStream("e:/aa/stu.xxx");
        ObjectOutputStream oos=new ObjectOutputStream(fos);//对象的序列化的一个流
        oos.writeObject(student);
        oos.close();
    }
}
