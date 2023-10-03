import StreamAPI.EMP;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestCollectCollection {
    public static void main(String[] args) {
        //toMap();
        toCollection();
    }
    public static void toList(){
        List<EMP> list= Arrays.asList(
                new EMP("小白",22,15000),
                new EMP("众青",22,16000),
                new EMP("大红",19,8000),
                new EMP("小绿",19,9000)
        );
        list.stream().filter(x->x.getName().startsWith("小"))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
    public static void toSet(){
        Set<Integer> collect = Stream.of(12, 3, 4, 5, 6, 7).
                filter(x -> x % 2 == 0).collect(Collectors.toSet());
        collect.forEach(System.out::println);
    }
    public static void toMap(){
        List<EMP> list= Arrays.asList(
                new EMP("小白",22,15000),
                new EMP("众青",22,16000),
                new EMP("大红",19,8000),
                new EMP("小绿",19,9000)
        );
        Map<String, EMP> collect = list.stream().filter(e -> e.getSal() >= 10000)
                .collect(Collectors.toMap(EMP::getName, e -> e));
        collect.forEach((k,v)-> System.out.println(k+"\t"+v));
    }
    public static void toCollection(){
        ArrayList<String> collect = Stream.of("abc", "ddd", "xxx")
                .collect(Collectors.toCollection(ArrayList::new));
        collect.forEach(System.out::println);
    }
}
