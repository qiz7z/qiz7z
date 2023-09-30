package 队列;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        //是一个接口，继承于collection
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(12);//超出边界会抛出异常
        queue.offer(13);
        /*System.out.println("queue.remove() = " + queue.remove());//从头部删除，并返回
        System.out.println(queue);
        System.out.println("queue.remove() = " + queue.remove());//从头部删除，并返回
        System.out.println(queue);
        System.out.println("queue.poll() = " + queue.poll());*/

        System.out.println("queue.element() = " + queue.element());//get the first element in queue
        Integer peek = queue.peek();
        System.out.println("peek = " + peek);
    }
}
