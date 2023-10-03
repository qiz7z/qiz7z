package StreamAPI;

import java.util.Objects;

public class EMP {
    private String name;
    private Integer age;
    private Integer sal;

    public EMP() {
    }

    public EMP(String name, Integer age, Integer sal) {
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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EMP emp = (EMP) object;
        return Objects.equals(name, emp.name) && Objects.equals(age, emp.age) && Objects.equals(sal, emp.sal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sal);
    }

    @Override
    public String toString() {
        return "EMP{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }
}
