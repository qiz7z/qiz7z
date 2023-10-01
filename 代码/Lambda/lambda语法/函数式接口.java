package lambda语法;
@FunctionalInterface
public interface MathInterFace {//函数式接口
    Integer expand10(Integer i);//一个接口只能含有一个抽象函数
    //Integer abs(Integer i);

    default  Integer abs(Integer i){
        return Math.abs(i);
    }
}
