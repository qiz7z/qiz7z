package StreamAPI;

import java.util.Objects;

public class Employer {
    private String name;
    private Integer age;
    private String gender;
    private String part;

    public Employer() {
    }

    public Employer(String name, Integer age, String gender, String part) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", part='" + part + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Employer employer = (Employer) object;
        return Objects.equals(name, employer.name) && Objects.equals(age, employer.age) && Objects.equals(gender, employer.gender) && Objects.equals(part, employer.part);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, part);
    }
}
