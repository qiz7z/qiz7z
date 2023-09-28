package Set;

import java.util.Objects;

public class Student {
    private String name;
    private String gender;


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

    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    /*public boolean equals(Object obj){
        System.out.println("run the method of equals()");
        if(this==obj)
            return  true;
        if(obj instanceof Student)
        {
            Student student=(Student) obj;
            return this.name.equals(student.name) && this.gender.equals(gender);
        }
        return false;
    }*/

    @Override
    public boolean equals(Object object) {
        System.out.println("run the method of equals()");
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name) && Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
