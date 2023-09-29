package 排序接口;

import java.util.TreeSet;

public class TestStaff {
    public static void main(String[] args) {
        TreeSet<Staff> set=new TreeSet<>();
        set.add(new Staff("阿卡丽",14,"woman"));
        set.add(new Staff("金克斯",16,"woman"));
        set.add(new Staff("娜可露露",19,"woman"));
        set.add(new Staff("易",23,"man"));
        set.add(new Staff("蒙多",17,"man"));
        System.out.println(set);
    }
}
