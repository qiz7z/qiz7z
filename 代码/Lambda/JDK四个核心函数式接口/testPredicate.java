package lambda4functions;

import Lambda.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class testPredicate {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));

        Predicate<Hero> predicate=h->h.getBlood()>=10000;
        List<Hero> heroes=filterBlood(list,predicate);
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
    public static List<Hero> filterBlood(List<Hero> list, Predicate<Hero> predicate ){
        List<Hero> newlist=new ArrayList<>();
        for (Hero hero : list) {
            boolean test = predicate.test(hero);
            if (test)
                newlist.add(hero);
        }
        return newlist;
    }
}
