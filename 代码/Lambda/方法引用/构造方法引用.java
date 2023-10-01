package 方法引用;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test4 {
    public static void main(String[] args) {
        /*Supplier<Teacher> supplier=new Supplier<Teacher>() {
            @Override
            public Teacher get() {
                return new Teacher();
            }
        };*/
      /*  Supplier<Teacher> supplier=()->new Teacher();
        System.out.println(supplier.get());//无参*/
        //Supplier<Teacher> supplier=Teacher::new;
        /*Function<String,Teacher> function=Teacher::new;
        System.out.println(function.apply("阿卡丽"));*/
        BiFunction<String,Integer,Teacher> function=Teacher::new;
        System.out.println(function.apply("阿卡丽", 90));

    }
}
package 方法引用;

public class Teacher {
    private String name;
    private Integer age;

    public Teacher() {
        System.out.println("无参构造函数");
    }

    public Teacher(String name) {
        this.name = name;
        System.out.println("有一个构造函数");
    }

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("有两个构造函数");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
