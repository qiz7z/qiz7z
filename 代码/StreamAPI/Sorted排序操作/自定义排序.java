package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestSortdComporator {
    public static void main(String[] args) {
        List<EMP> list= Arrays.asList(
                new EMP("小白",22,15000),
                new EMP("小青",22,16000),
                new EMP("小红",19,8000)
        );
        //按照年龄进行排序处理
        /*list.stream().sorted((o1, o2)-> Integer.compare(o1.getAge(),o2.getAge())).
                forEach(System.out::println);*/
        //按照工资降序排列
        /*list.stream().sorted(Comparator.comparing(EMP::getSal).reversed())
                .forEach(System.out::println);*/
    //按年龄升序排列，如果相同则按工资降序排列
        //1.
       /* list.stream().sorted(Comparator.comparing(EMP::getAge).
                thenComparing(EMP::getSal).reversed()).forEach(System.out::println);*/
        //2.
        list.stream().sorted((o1,o2)->{
            int compare = Integer.compare(o1.getAge(), o2.getAge());
            if (compare==0){
                return Integer.compare(o2.getSal(),o1.getSal());
            }else {
                return compare;
            }
        }).forEach(System.out::println);
        //按年龄升序，若相同则按工资升序
        /*list.stream().sorted(Comparator.comparing(EMP::getAge).
                thenComparing(EMP::getSal)).forEach(System.out::println);*/
    }
}
