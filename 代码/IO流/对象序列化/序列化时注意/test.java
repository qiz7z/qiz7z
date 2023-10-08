package com.coder;

import java.io.*;

public class TestStudent {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        t1();
        t2();
    }
    public static void t1() throws IOException{//序列化
        Teacher teacher=new Teacher();
        teacher.setTeacherGender("man");
        teacher.setTeacherName("banana");
        Student student=new Student("apple","man",23,"china",teacher);
        FileOutputStream fos=new FileOutputStream("e:/aa/stu.xxx");
        ObjectOutputStream oos=new ObjectOutputStream(fos);//对象的序列化的一个流
        oos.writeObject(student);
        oos.close();
    }
    public static void t2() throws IOException, ClassNotFoundException {//反序列化
        FileInputStream fis=new FileInputStream("e:/aa/stu.xxx");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Object student = (Student)ois.readObject();
        System.out.println(student);
        ois.close();

    }
}
