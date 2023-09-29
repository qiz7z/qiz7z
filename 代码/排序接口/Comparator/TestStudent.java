package 排序接口;

import java.util.Comparator;
import java.util.TreeSet;

public class TestStudent {
    public static void main(String[] args) {
        TreeSet<Student> set=new TreeSet<>(new Comparator<Student>(){
        public int compare(Student o1, Student o2) {
            //return  Integer.compare(o1.getHeight(), o2.getHeight());
            if(o1.getHeight()==o2.getHeight()){
                return  Integer.compare(o1.getScore(), o2.getScore());
            }else{
                return  Integer.compare(o1.getHeight(), o2.getHeight());
            }
        }
        });
        set.add(new Student("d",170,80));
        set.add(new Student("c",179,99));
        set.add(new Student("a",170,69));
        set.add(new Student("b",179,100));
        System.out.println(set);
    }
}
/*
class Com implements Comparator<Student>{//可以写成匿名内部类的形式
    @Override
    public int compare(Student o1, Student o2) {
        return  Integer.compare(o1.getHeight(), o2.getHeight());
    }
}*/
