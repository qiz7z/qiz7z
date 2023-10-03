package StreamAPI;

import java.util.Objects;

public class Staff implements Comparable<Staff>{
    private String name;
    private Integer age;
    private Integer sal;

    public Staff() {
    }

    public Staff(String name, Integer age, Integer sal) {
        this.name = name;
        this.age = age;
        this.sal = sal;
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

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Staff staff = (Staff) object;
        return Objects.equals(name, staff.name) && Objects.equals(age, staff.age) && Objects.equals(sal, staff.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }


    @Override
    public int compareTo(Staff o) {
        return Integer.compare(this.age,o.age);
    }
}
