package com.coder;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 8090034645353830909L;//标识接口
    //private static  final  long serialVersionUID=1L;
    private String name;
    private String gender;
    private transient int age;
    private String address;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, String gender, int age, String address, Teacher teacher) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.teacher = teacher;
    }

    public Student(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
