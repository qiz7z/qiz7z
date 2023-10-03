package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class TestReduce1 {
    public static void main(String[] args) {
        //求所有英雄的血量总和
        //求最大血量
        List<Hero> heroList=Arrays.asList(new Hero("King",10000),
                new Hero("MoonGirl",14000),
                new Hero("小乔",7000));
    //求和操作
        //1.
        /*Integer reduce = heroList.stream().reduce(0, (sum, hero) -> sum += hero.getBlood(),
                Integer::sum);
        System.out.println(reduce);*/
        //2.
        /*Integer reduce = heroList.stream().map(Hero::getBlood).
                reduce(0, Integer::sum);
        System.out.println(reduce);*/
    //求最大值
        Integer reduce = heroList.stream().map(Hero::getBlood).
                reduce(0, Integer::max);
        System.out.println(reduce);
    }
}
