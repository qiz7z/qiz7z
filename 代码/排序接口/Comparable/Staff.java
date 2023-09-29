package 排序接口;

import java.util.Objects;

public class Staff implements Comparable<Staff> {
    private String name;
    private Integer age;
    private String gender;

    public Staff() {
    }

    public Staff(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Staff staff = (Staff) object;
        return Objects.equals(name, staff.name) && Objects.equals(age, staff.age) && Objects.equals(gender, staff.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public int compareTo(Staff o) {
        //按照那个属性进行排序
        //小于传入参数，返回-1，相同返回0，大于返回1
       return Integer.compare(this.age,o.age);
    }
}
