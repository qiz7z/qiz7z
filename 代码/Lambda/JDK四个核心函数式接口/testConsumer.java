package lambda4functions;

import java.util.function.Consumer;

public class testConsumer {
    public static void main(String[] args) {
        testconsumer();
    }
    public static void testconsumer(){
        Consumer<Integer> c1=money-> System.out.println("客户c1花"+money+"yuan买装备");
        buy(1000,c1);
        Consumer<Integer> c2=money-> System.out.println("客户c2花"+money+"yuan买零食");
        buy(3000,c2);
        Consumer<Integer> c3=money-> System.out.println("客户c3花"+money+"yuan买衣服");
        buy(4000,c3);
    }
    public static void buy(int money,Consumer<Integer> consumer){
        consumer.accept(money);
    }
}
