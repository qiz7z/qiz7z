package Lambda;

import java.util.ArrayList;
import java.util.List;

public class Test4 {//只需要Hero类使用即可
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));
        //可以没有借口和继承至接口的类
        list.stream().filter(h->h.getBlood()>=10000).forEach(System.out::println);
    }
    /*public static List<Hero> filterhero(List<Hero> list,FilterHero filterHero){
        return filterHero.doFilter(list);
    }*/
}
