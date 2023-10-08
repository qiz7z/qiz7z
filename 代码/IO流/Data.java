package com.coder;

import java.io.*;

public class TestData {
    public static void main(String[] args) throws IOException {
        /*DataOutputStream dos=new DataOutputStream(new FileOutputStream("e:/aa/x.xx"));
        Student student=new Student();
        student.setAge(19);
        student.setName("李贺");
        dos.writeUTF(student.getName());
        dos.writeInt(student.getAge());
        dos.close();*/
        DataInputStream dis=new DataInputStream(new FileInputStream("e:/aa/x.xx"));
        String name= dis.readUTF();
        int age=dis.readInt();
        System.out.println(name+"\t"+age);
        dis.close();
    }
}
