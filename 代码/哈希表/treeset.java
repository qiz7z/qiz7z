package Set;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        //treeset底层是二叉树，采用中序遍历将数据读取出来，所以
        //不管放入元素顺序怎样，最终读取都是一升序排列
        /*TreeSet<Integer> set=new TreeSet<>();
        set.add(100);
        set.add(92);
        set.add(80);
        set.add(24);
        set.add(56);
        set.add(45);
        set.add(33);
        System.out.println(set);*/
        TreeSet<Student> students=new TreeSet<>();
        //传递进来的对象要具有排序能力（Comparable），这里会报错
        Student student1=new Student("易","男");
        Student student2=new Student("阿卡丽","女");
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
