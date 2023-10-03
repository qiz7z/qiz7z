package StreamAPI;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMaP {
    public static void main(String[] args) {
        //map映射操作基本数据类型
        /*List<Double> list= Arrays.asList(2.145,4.567,5.786,6.783);
        *//*for (Double v : list) {
            System.out.println("k2(v) = " + k2(v));
        }*//*
        list.stream().map(TestMaP::k2).forEach(System.out::println);*/

        //getHeroName();

        addBlood();
    }
    //保留两位小数
    public static double k2(double x){
        return (int)(x*100+0.5)/100D;//D的意思是转为double类型
    }
    //属性提取
    public static void getHeroName(){
        List<Hero> heroList=Arrays.asList(new Hero("King",10000),
                new Hero("MoonGirl",14000),
                new Hero("小乔",7000));
        heroList.stream().map(Hero::getName).forEach(System.out::println);
        /*List<String> collect = heroList.stream().map(Hero::getName).collect(Collectors.toList());
        collect.forEach(System.out::println);*/
    }
    //对引用类型数据进行修改
    public static void addBlood(){
        List<Hero> heroList=Arrays.asList(new Hero("King",10000),
                new Hero("MoonGirl",14000),
                new Hero("小乔",7000));
        //不改变数据源
        heroList.stream().map(h->{
            Hero hero=new Hero(h.getName(),h.getBlood());
            hero.setBlood(hero.getBlood()+1000);
            return hero;
        }).forEach(System.out::println);
        //改变了数据源
       /* heroList.stream().map(h->{
            h.setBlood(h.getBlood()+1000);
            return h;})
                .forEach(System.out::println);*/
        System.out.println("------------------------");
        heroList.forEach(System.out::println);

    }
}
