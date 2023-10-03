package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestStaff {
    public static void main(String[] args) {
        List<Staff> list= Arrays.asList(
                new Staff("小白",22,15000),
                new Staff("小青",27,16000),
                new Staff("小红",19,8000)
        );
        //自然排序默认升序
        list.stream().sorted().forEach(System.out::println);
        System.out.println("----------------------------");
        /*Collections.sort(list);
        list.forEach(System.out::println);*/
        list.stream().filter(x->x.getSal()>=10000).sorted().forEach(System.out::println);
    }
}
