package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJoining {
    public static void main(String[] args) {
        List<Employer> list= Arrays.asList(
                new Employer("鲁达",18,"man","科研部"),
                new Employer("林妹妹",15,"woman","设计部"),
                new Employer("龙傲天",26,"man","战斗部"),
                new Employer("薛宝钗",15,"woman","科研部")
        );
        //将来那个歌员工的姓名进行拼接
        //joining无参，直接拼接
        /*String str = list.stream().map(Employer::getName)
                .collect(Collectors.joining());
        System.out.println("str = " + str)*/;
        //有一个参数，连接符号
       /* String collect = list.stream().map(Employer::getName)
                .collect(Collectors.joining("-"));
        System.out.println("collect = " + collect);*/
        //三个参数，连接符号、前缀、后缀
        String str = list.stream().map(Employer::getName)
                .collect(Collectors.joining("-", "|", "|"));
        System.out.println("str = " + str);
    }
}
