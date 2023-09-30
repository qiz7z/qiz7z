package 队列;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();
        deque.add(123);
        deque.addLast(23);//后面插入
        deque.add(237);
        deque.addFirst(1);//前面插入
        deque.addLast(34);
        System.out.println(deque);
    }
}
