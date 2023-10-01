package lambda4functions;

import java.util.function.Function;

public class testFunction {
    public static void main(String[] args) {
        /*Function<Double,Double> function=(x)->(int)(x*100+0.5)/100D;
        System.out.println(keep(3.1465,function));
        Function<Double,Double> function1=(x)->(int)(x*1000+0.5)/1000D;
        System.out.println(keep(3.1465,function1));*/

        //System.out.println(keepInt(3.1324,x->x.intValue()));

        Function<Double,Integer> function=(x)->x.intValue();
        System.out.println(keepInt(3.2345,function));
    }
    public static  double keep(double x, Function<Double,Double> function){
        return function.apply(x);
    }
    public static int keepInt(double x,Function<Double,Integer> function){
        return function.apply(x);
    }
}
