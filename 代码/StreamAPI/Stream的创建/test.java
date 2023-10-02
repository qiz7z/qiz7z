package Stream创建;

import java.nio.file.Files;
import java.util.*;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("aa","bb","dd");
        //1.通过Collection接口的stream()方法使用集合创建流
        Stream<String> stream = list.stream();
        //2.通过Arrays.stream(T[] array)方法使用数组创建流
        String[] strs={"aa","bb","dd"};
        Stream<String> stream1 = Arrays.stream(strs);
        //3.使用StreamAPI中的静态方法创建流
       /* Stream<String> stream2=Stream.of("aa","bbb","dd");
        stream2.filter(x->x.length()==3).forEach(System.out::println);*/
       /* Stream<Integer> iterate = Stream.iterate(0, x -> x + 2);
        iterate.limit(10).forEach(System.out::println);*/
        Stream<Double> stream2=Stream.generate(Math::random);
        stream2.limit(3).forEach(System.out::println);
        //4.使用Files类来创建流
        /*Files.lines();
        Files.list();*/
    }
}
