package com.coder;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = -6581806569752470730L;
    private String teacherName;
    private String teacherGender;

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherGender() {
        return teacherGender;
    }

    public void setTeacherGender(String teacherGender) {
        this.teacherGender = teacherGender;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherName='" + teacherName + '\'' +
                ", teacherGender='" + teacherGender + '\'' +
                '}';
    }
}
