package com.coder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EMP implements Externalizable {
    private static final long serialVersionUID = 6391311859772877442L;
    private String name;
    private String gender;
    private int age;

    public EMP() {
        System.out.println("无参的构造方法");
    }

    public EMP(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //是否序列化看下边两个函数里面写的内容
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {//序列化
        out.writeUTF(name);
        out.writeUTF(gender);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {//读取、反序列化
        name=in.readUTF();
        gender=in.readUTF();
        age=in.readInt();
    }

    @Override
    public String toString() {
        return "EMP{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
