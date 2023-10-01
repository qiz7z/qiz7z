package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));
        //策略模式，通过两个实现类
        List<Hero> filterhero = filterhero(list, new FilterHeroByBlood());
        for (Hero hero : filterhero) {
            System.out.println(hero);
        }
    }
    public static List<Hero> filterhero(List<Hero> list,FilterHero filterHero){
        return filterHero.doFilter(list);
    }
}
//需要配合上边的Hero类使用
