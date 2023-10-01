package 方法引用;

import java.util.function.Consumer;

public class test6 {
    public static void main(String[] args) {

    }
}
class XX{
    public void test1(String str){

    }
    public void test2(String str){
        //Consumer<String> consumer=s->test1(s);
        Consumer<String> consumer= this::test1;
    }
}
class YY extends XX{
    public void test(String str){
        Consumer<String> consumer=super::test1;//调用父类
    }
}
