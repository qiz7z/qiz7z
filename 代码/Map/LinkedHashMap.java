package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        //与LinkedHashSet类似，有序、唯一
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("Chinese",90);
        map.put("Math",90);
        map.put("English",90);
        map.put("Chemistry",90);
        map.put("Chemistry",80);
        System.out.println(map);
    }
}
