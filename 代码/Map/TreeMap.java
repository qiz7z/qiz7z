package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        //按照键默认升序处理,与treeset类似
        map.put("apple",4);
        map.put("pear",3);
        map.put("banana",6);
        map.put("orange",9);
        System.out.println(map);
    }
}
