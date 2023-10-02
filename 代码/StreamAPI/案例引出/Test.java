package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//王者荣耀
//英雄，名字，血量
//将所有血量值小于5000的英雄取出,并给他们添加500的血量值
public class Test {
    public static void main(String[] args) {
        List<Hero> list=new ArrayList<>();
        list.add(new Hero("亚瑟",10000));
        list.add(new Hero("项羽",14000));
        list.add(new Hero("小乔",4000));
        list.add(new Hero("李元芳",4500));

        /*List<Hero> heroList=filter(list);
        heroList.forEach(System.out::println);*/
        //流(stream)的方式，不需要再调用下面的方法
        /*Stream<Hero> stream = list.stream();
        List<Hero> collect = stream.filter(hero -> hero.getBlood() < 5000)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);*/
        //增强enhance
        /*enhance(list);
        list.forEach(System.out::println);*/
        //增强2.0
        /*List<Hero> enhance = enhance(list);
        enhance.forEach(System.out::println);*/
        //链式编程
        Stream<Hero> stream = list.stream();
        List<Hero> collect = stream.filter(hero -> hero.getBlood() < 5000)
                .map(hero -> {
                    hero.setBlood(hero.getBlood()+500);
                    return hero;
                })
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
    public static List<Hero> filter(List<Hero> list){
        List<Hero> newlist=new ArrayList<>();
        for (Hero hero : list) {
            if(hero.getBlood()<5000){
                //System.out.println(hero);
                newlist.add(hero);
            }
        }
        return newlist;
    }
    /*public static void enhance(List<Hero> list){
        for (Hero hero : list) {
            if(hero.getBlood()<5000){
                hero.setBlood(hero.getBlood()+500);
            }
        }
    }*/
    public static List<Hero> enhance(List<Hero> list){
        List<Hero> newlist=new ArrayList<>();
        for (Hero hero : list) {
            if(hero.getBlood()<5000){
                hero.setBlood(hero.getBlood()+500);
                newlist.add(hero);
            }
        }
        return newlist;
    }
}
