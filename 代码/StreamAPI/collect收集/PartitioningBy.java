package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TesftPartitioningBy {
    public static void main(String[] args) {
        List<EMP> list= Arrays.asList(
                new EMP("小白",22,15000),
                new EMP("小青",22,16000),
                new EMP("小红",19,8000)
        );
        Map<Boolean, List<EMP>> collect = list.stream().
                collect(Collectors.partitioningBy(x -> x.getSal() >= 10000));
        collect.forEach((k,v)-> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
