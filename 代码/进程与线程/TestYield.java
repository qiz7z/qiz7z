package com.coder;

public class TestYield {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            int x=0;
            while (true){
                System.out.println("线程1:"+x++);
            }
        });
        Thread t2=new Thread(()->{
            int x=0;
            while (true){
                Thread.yield();//当cpu执行进程2时遇到这个，就将CPU让出
                System.out.println("\t\t\t线程2:"+x++);
            }
        });
        t1.start();
        t2.start();
    }
}
