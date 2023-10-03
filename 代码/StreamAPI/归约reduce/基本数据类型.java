package StreamAPI;

import java.util.Optional;
import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 34);
    //求和
        //使用mapToInt转成整数数据的操作
      /*  int sum = Stream.of(1, 2, 3, 4, 5, 34).mapToInt(Integer::intValue).sum();
        System.out.println(sum);*/
        //使用归约方式1
        /*Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 34);
        Optional<Integer> reduce = integerStream.reduce(Integer::sum);
        System.out.println(reduce.get());*/
        //使用归约方式2
        /*Integer reduce = integerStream.reduce(0, Integer::sum);
        System.out.println(reduce);*/
    //求积
        //1.
        /*Optional<Integer> reduce = integerStream.reduce((x, y) -> x * y);
        System.out.println(reduce.get());*/
        //2.
       /* Integer reduce = integerStream.reduce(1, (x, y) -> x * y);
        System.out.println(reduce);*/
    //max
        //1
        /*Optional<Integer> reduce = integerStream.reduce((x, y) -> x > y ? x : y);
        System.out.println(reduce.get());*/
        //2
        /*Optional<Integer> reduce = integerStream.reduce(Integer::max);
        System.out.println(reduce.get());*/
    //min
        //1.
       /* Optional<Integer> reduce = integerStream.reduce((x, y) -> x < y ? x : y);
        System.out.println(reduce.get());*/
        //2.
        Optional<Integer> reduce = integerStream.reduce(Integer::min);
        System.out.println(reduce.get());
    }
}
