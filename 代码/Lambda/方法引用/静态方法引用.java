package 方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,32,15,6,78,35);
        //list.sort((o1,o2)-> Integer.compare(o1,o2));
        list.sort(Integer::compare);
        System.out.println(list);
    }
}
