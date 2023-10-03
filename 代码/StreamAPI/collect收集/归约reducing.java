package StreamAPI;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestReducing {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1, 12, 3, 4, 5);
        /*Optional<Integer> collect = s.collect(Collectors.reducing(Integer::sum));
        System.out.println(collect.get());*/
        Optional<Integer> collect1 = s.reduce(Integer::sum);
        System.out.println(collect1.get());
    }

}
