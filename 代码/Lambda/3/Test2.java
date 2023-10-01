package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test2 {//需要配合上边的接口和Hero类使用
    public static void main(String[] args) {//匿名内部类优化
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));
        List<Hero> filterhero = filterhero(list, new FilterHero() {
            @Override
            public List<Hero> doFilter(List<Hero> list) {
                List<Hero> newlist = new ArrayList<>();
                for (Hero hero : list) {
                    if(hero.getBlood()>=10000){
                        newlist.add(hero);
                    }
                }
                return newlist;
            }
        });
        for (Hero hero : filterhero) {
            System.out.println(hero);
        }
    }
    public static List<Hero> filterhero(List<Hero> list,FilterHero filterHero){
        return filterHero.doFilter(list);
    }
}
