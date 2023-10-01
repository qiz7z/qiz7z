package Lambda;

import java.util.ArrayList;
import java.util.List;

public class TestHero {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("亚瑟","战士",10000));
        list.add(new Hero("项羽","坦克",14000));
        list.add(new Hero("露娜","打野",7000));
        list.add(new Hero("鲁班","射手",5000));
        List<Hero> heroes = filterblood(list);//filterJob(list);
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
    public static List<Hero> filterJob(List<Hero> list) {
        List<Hero> newlist = new ArrayList<>();
        for (Hero hero : list) {
            if(hero.getJob().equals("坦克")){
                newlist.add(hero);
            }
        }
        return newlist;
    }
    public static List<Hero> filterblood(List<Hero> list){
        List<Hero> newlist = new ArrayList<>();
        for (Hero hero : list) {
            if(hero.getBlood()>=10000){
                newlist.add(hero);
            }
        }
        return newlist;
    }
}
