package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestGroupingBy {
    public static void main(String[] args) {
        List<Employer> list= Arrays.asList(
                new Employer("鲁达",18,"man","科研部"),
                new Employer("林妹妹",15,"woman","设计部"),
                new Employer("龙傲天",26,"man","战斗部"),
                new Employer("薛宝钗",15,"woman","科研部")
        );
        //as part
        /*Map<String, List<Employer>> map1 = list.stream()
                .collect(Collectors.groupingBy(Employer::getPart));
        map1.forEach((k,v)->{
            System.out.println("part："+k);
            v.forEach(System.out::println);
        });*/
        //as gender
        /*Map<String, List<Employer>> map2 = list.stream()
                .collect(Collectors.groupingBy(Employer::getGender));
        map2.forEach((k,v)->{
            System.out.println("Gender："+k);
            v.forEach(System.out::println);
        });*/
        //first as gender,later as part
       /* Map<String, Map<String, List<Employer>>> collect = list.stream().collect(Collectors.groupingBy(Employer::getGender,
                Collectors.groupingBy(Employer::getPart)));
        collect.forEach((k,v)->{
            System.out.println("gender:"+k);
            v.forEach((k1,v1)->{
                System.out.println("part:"+k1);
                v1.forEach(System.out::println);
            });
        });*/
        //as age
        Map<String, List<Employer>> collect = list.stream().collect(Collectors.groupingBy(e -> {
            if (e.getAge() < 30)
                return "青年员工";
            else
                return "中年员工";
        }));
        collect.forEach((k,v)->{
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
