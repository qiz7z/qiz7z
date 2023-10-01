package Lambda;

import java.util.ArrayList;
import java.util.List;

public class FilterHeroByJob implements FilterHero{
    @Override
    public List<Hero> doFilter(List<Hero> list) {
        List<Hero> newlist = new ArrayList<>();
        for (Hero hero : list) {
            if(hero.getJob().equals("坦克")){
                newlist.add(hero);
            }
        }
        return newlist;
    }
}
