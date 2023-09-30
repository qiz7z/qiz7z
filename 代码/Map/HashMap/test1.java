package Map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i =0;i<12;i++){
            map.put(i,i);
        }
        System.out.println(map);
        map.put(12,121);
        System.out.println(map);
    }
}
