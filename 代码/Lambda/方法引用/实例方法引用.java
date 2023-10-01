package 方法引用;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class test2 {
    public static void main(String[] args) {
        //Consumer<String> consumer= X::test;
        /*Consumer<String> consumer=new Consumer<String>() {
            @Override
            public void accept(String s) {
                X.test(s);
            }
        };*/
        /*Supplier<Integer> supplier=new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new X().random();
            }
        };
*/
        //Supplier<Integer> supplier=new X()::random;
        List<Integer> list= Arrays.asList(12,32,15,6,78,35);
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        list.forEach(integer -> System.out.println(integer));
        list.forEach(System.out::println);
    }
}
class X{
    public static void test(String x){
        System.out.println(x);
    }
    public int random(){
        Random r=new Random();
        return r.nextInt(10);
    }
}
