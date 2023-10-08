package com.coder;

import java.io.*;

public class TestExternal {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EMP emp=new EMP("李清照","女",19);
        /*emp.setName("李清照");
        emp.setGender("女");
        emp.setAge(19);*/
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e:/aa/emp.yyy"));
        oos.writeObject(emp);//写入对象
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:/aa/emp.yyy"));
        Object o = ois.readObject();
        EMP emp1=(EMP)o;
        System.out.println(emp1);
    }
}
