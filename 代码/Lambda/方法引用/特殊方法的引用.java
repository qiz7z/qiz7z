package 方法引用;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class test3 {
    public static void main(String[] args) {
        //当我们函数中有参数，第一个参数来调用方法，可使用特殊方法引用
        //String s="abc";
       /* Function<String,String> f=String::toUpperCase;
        System.out.println(f.apply(s));*/
        //
       /* Function<String,String> f1=s1 -> s1.toUpperCase();
        System.out.println(f1.apply(s));*/
        //
        /*Function<String,String> f=new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println(f.apply(s));*/
        //
       /* BiPredicate<String,String> predicate=new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(predicate.test("wq","wq"));*/
        //
        /*BiPredicate<String,String> predicate=(s,s2)->s.equals(s2);//函数里有参数
        System.out.println(predicate.test("q", "w"));*/
        //
        BiPredicate<String,String> predicate=String::equals;
        boolean test = predicate.test("a", "s");
        System.out.println(test);
    }
}
