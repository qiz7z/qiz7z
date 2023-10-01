package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test3 {//需要配合Hero类和接口使用
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));
        //将匿名内部类做成lambda形式
        /*List<Hero> filterhero = */
        filterhero(list, list1 -> {
            List<Hero> newlist = new ArrayList<>();
            for (Hero hero : list1) {
                if(hero.getBlood()>=10000){
                    newlist.add(hero);
                }
            }
            return newlist;
        }).forEach(System.out::println);
        /*for (Hero hero : filterhero) {
            System.out.println(hero);
        }*/
    }
    public static List<Hero> filterhero(List<Hero> list,FilterHero filterHero){
        return filterHero.doFilter(list);
    }
}
