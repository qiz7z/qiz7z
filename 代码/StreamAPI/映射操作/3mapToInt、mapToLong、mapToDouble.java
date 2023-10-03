package StreamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestMapToInt {
    //一亿个函数为参数，将流中的每一个元素处理后生成一个新的流
    //三个函数产生的新的流可以进行很多后续的操作，最大值、最小值、求和、平均值、统计个数等等
    public static void main(String[] args) {
        //testToint();
        //testToint1();
        //maxAndmin();
        //sumAndavg();
        //summary();
        range();
    }
    public static  void  range(){
        System.out.println(IntStream.rangeClosed(1, 100).sum());//rangeclosed表示左右为闭区间
        System.out.println(IntStream.range(1, 100).sum());//左闭右开range表示
        Stream<Integer> boxed = IntStream.rangeClosed(1, 10).boxed();//boxed将数值流转为stream流
        boxed.forEach(System.out::println);

    }
    public static void summary(){
        IntSummaryStatistics intSummaryStatistics = Stream.of("1", "2", "3").
                mapToInt(Integer::valueOf).summaryStatistics();
        System.out.println("intSummaryStatistics.getMax() = " + intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println("intSummaryStatistics.getCount() = " + intSummaryStatistics.getCount());

    }
    public static void sumAndavgAndCOUNT(){
        List<Integer> list=Arrays.asList(12,34,1,4,67,89,99);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        long count = list.stream().mapToInt(Number::intValue).count();
        System.out.println(count);
        System.out.println(sum);
        System.out.println(average.getAsDouble());
    }
    public static void maxAndmin(){
        List<Integer> list=Arrays.asList(12,34,1,4,67,89,99);
        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = list.stream().mapToInt(x -> x.intValue()).min();
        System.out.println(max.getAsInt());
        System.out.println(min.getAsInt());
    }
    public static void testToint(){
        List<Integer> list= Arrays.asList(12,23,45,1,3);
        IntStream intStream = list.stream().mapToInt(x -> x * 10);
        intStream.forEach(System.out::println);
    }
    public static void testToint1(){
        List<String> list=Arrays.asList("aa","cccc","xxx","zzz");
        list.stream().mapToInt(String::length).forEach(System.out::println);
    }
}
