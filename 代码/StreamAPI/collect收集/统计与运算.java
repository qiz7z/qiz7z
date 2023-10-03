package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class TestCollectCalu {
    public static void main(String[] args) {
        List<EMP> list= Arrays.asList(
                new EMP("小白",22,15000),
                new EMP("小青",22,16000),
                new EMP("小红",19,8000)
        );
        //统计人数
       /* Long 小 = list.stream().filter(e -> e.getName().startsWith("小"))
                .collect(Collectors.counting());
        System.out.println(小);*/
        //可以替换
       /* Long 小1 = list.stream().filter(e -> e.getName().startsWith("小"))
                .count();
        System.out.println(小1);*/
        //获取最高值
        /*Optional<EMP> collect = list.stream().filter(e -> e.getSal() >= 10000)
                .collect(Collectors.maxBy(Comparator.comparing(EMP::getSal)));
        System.out.println(collect.get());
        //可以替换
        Optional<EMP> max = list.stream().filter(e -> e.getSal() >= 10000)
                .max(Comparator.comparing(EMP::getSal));
        System.out.println(max.get());*/
        //获取最低值
        /*Optional<EMP> collect = list.stream().filter(e -> e.getSal() >= 10000)
                .collect(Collectors.minBy(Comparator.comparing(EMP::getSal)));
        System.out.println(collect.get());
        //可以替换
        Optional<EMP> min = list.stream().filter(e -> e.getSal() >= 10000)
                .min(Comparator.comparing(EMP::getSal));
        System.out.println(min.get());*/
        //求和
        /*Integer collect = list.stream().collect(Collectors.summingInt(EMP::getSal));
        System.out.println(collect);
        //可以替换
        int sum = list.stream().mapToInt(EMP::getSal).sum();
        System.out.println(sum);*/
        //求平均值
        /*Double collect = list.stream().collect(Collectors.averagingDouble(EMP::getSal));
        System.out.println(collect);
        //可以替换
        OptionalDouble average = list.stream().mapToInt(EMP::getSal).average();
        System.out.println(average.getAsDouble());*/
        //一次性获取所有相关信息.等价于summaryStatistics
        IntSummaryStatistics collect = list.stream().collect(Collectors.summarizingInt(EMP::getAge));
        System.out.println(collect.getMax());
        System.out.println(collect.getAverage());
    }
}
