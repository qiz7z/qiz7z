package StreamAPI;

import org.w3c.dom.ls.LSOutput;
//接收一个函数作为参数，将流中的每个值都换成另一个流，把所有的流连接成一个流
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestFloatMap {
    public static void main(String[] args) {
        String str="a,b,c,d,e";
        String str1="f,g,h";
        List<String> list = Arrays.asList(str, str1);
        /*Stream<Stream<String>> streamStream = list.stream().map(TestFloatMap::f);
        streamStream.forEach(s->{
            s.forEach(System.out::println);
                }
        );*/
        Stream<String> stream = list.stream().flatMap(s -> f(s));
        stream.forEach(System.out::println);
        //f(str).forEach(System.out::println);
    }
    public static Stream<String> f(String str){//使用逗号方式分隔的字符串
        String[] strs=str.split(",");
        Stream<String> stream= Arrays.stream(strs);
        return stream;

    }
}
