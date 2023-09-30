package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//从键盘接受一行字符串
//统计没每个字符串出现的次数
public class Test2CountNums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String str=scanner.next();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(map.containsKey(c)){
                //当kay的值相等时，后放入的，加一覆盖之前的
                map.put(c,map.get(c)+1);
            }else {//若不相等则认为1是第一次出现，直接放一个1
                map.put(c,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
