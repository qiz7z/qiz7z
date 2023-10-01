package 方法引用;

import java.util.Arrays;
import java.util.function.Function;

public class test5 {
    public static void main(String[] args) {
        //Function<Integer,Integer[]> function= integer -> new Integer[integer];
        Function<Integer,Integer[]> function=Integer[]::new;
        Integer[] apply=function.apply(10);
        Arrays.fill(apply,10);
        System.out.println(Arrays.toString(apply));
        System.out.println(apply.length);
    }
}
