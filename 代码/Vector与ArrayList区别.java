package 链表;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
       // ArrayList在调用构造方法时默认大小为0，而Vector默认为10
        //ArrayList扩容每次扩大原来的1.5倍，而Vector扩容时，可以给定一个值capacityIncrement,原有大小加它，否则扩容为原来的2倍
        //ArrayList是非线程安全，而Vector线程安全
        Vector<String> vector=new Vector<>();
        ArrayList<String> list=new ArrayList<>();
    }
}
