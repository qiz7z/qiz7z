package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        //Chinese-90
        Map<String,Integer> map=new HashMap<>();
        //hashmap，允许value重复，key不允许重复
        //put向hashmap存储数据
        map.put("Chinese",90);
        map.put("Math",90);
        map.put("English",90);
        map.put("Chemistry",90);
        map.put("Chemistry",80);//通过equals方法进行比较，若不同，后放进去的值会覆盖前面的值
        Map<String,Integer> map1=new HashMap<>();
        map1.put("art",78);
        map1.put("snatch",78);
        map.putAll(map1);
        System.out.println(map);
        map.replace("Math",1);
        System.out.println(map);

        /*System.out.println(map.size());//判断元素个数
        System.out.println(map.isEmpty());//判断是否为空*/
        //清除元素
        /*map.clear();
        System.out.println(map);*/
        //移除，按照key来移除
        /*map.remove("Math");
        System.out.println(map);
        map.remove("Chemistry",80);
        System.out.println(map);
*/
        //判断map中是否有键或值，均返回boolean类型
        /*boolean math = map.containsKey("Math");
        System.out.println(math);
        boolean b = map.containsValue(80);
        System.out.println(b);*/
        //循环遍历的方式
       /* Set<String> set = map.keySet();//all the key
        for (String s : set) {
            System.out.println(s+":"+map.get(s));
        }
        //效率更高（下面）
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }*/
        //System.out.println(map);
        //get获得数据
        /*Integer Chinese=map.get("Chinese");
        System.out.println(Chinese);*/
    }
}
