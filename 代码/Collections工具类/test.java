package 排序接口;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*Student student1=new Student("apple",170,89);
        Student student2=new Student("pear",189,99);
        Student student3=new Student("orange",147,67);
        Student student4=new Student("banana",156,79);
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getHeight(),o2.getHeight());
            }
        });
        System.out.println(list);*/

        List<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(12);
        list.add(2);
        list.add(45);
        list.add(78);
        System.out.println("未排序之前的排序：");
        System.out.println(list);
        Collections.sort(list);//默认升序
        System.out.println("排序之后的排序：");
        System.out.println(list);
        System.out.println("反转之后：");
        Collections.reverse(list);//反转变降序
        System.out.println(list);
        Collections.shuffle(list);//打乱顺序
        System.out.println("打乱顺序之后：");
        System.out.println(list);
        Collections.swap(list,0,4);//交换位置
        System.out.println("交换位置之后：");
        System.out.println(list);
        System.out.println("集合中的最大值："+Collections.max(list));
        System.out.println("集合中的最小值："+Collections.min(list));
        Collections.sort(list);//进行二分查找前需要先排序
        System.out.println("二分查找得到所查值索引："+Collections.binarySearch(list,45));
        //Collections.fill(list,100);
        //System.out.println("填充过后："+list);
        list.add(12);
        Collections.replaceAll(list,12,109);
        System.out.println(list);
        System.out.println(Collections.frequency(list,109));//统计元素出现的次数
        System.out.println(list);
        Collections.rotate(list,-3);//0则不改变，整数，则将后面几位移动到前面，为负数，则将前面的几位移动到后面
        System.out.println(list);
    }
}
