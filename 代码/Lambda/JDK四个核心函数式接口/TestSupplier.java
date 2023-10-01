package lambda4functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Supplier;

public class TestSupplier {
    public static void main(String[] args) {
        //1
        /*Supplier<String> s1=()->{
            //String num="0123456789";
            Random random=new Random();
            String code="";
            for(int i=0;i<4;i++){
                int x = random.nextInt(10);
                code+=x;
            }
            return code;
        };
        List<String> codeList=getCode(3,s1);
        System.out.println(codeList);*/
        //2
        Supplier<String> s2=()->{
            String z="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String code="";
            for(int i=0;i<5;i++){
                int index=(int)(Math.random()*z.length());
                code+=z.charAt(index);
            }
            return code;
        };
        List<String> codeList=getCode(3,s2);
        System.out.println(codeList);
    }
    public static List<String> getCode(int x, Supplier<String> supplier){
        List<String> list=new ArrayList<>(x);
        for(int i=0;i<x;i++){
            list.add(supplier.get());
        }
        return list;
    }
}
