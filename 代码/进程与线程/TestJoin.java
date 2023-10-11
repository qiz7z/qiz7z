package com.coder;

import java.util.concurrent.TimeUnit;

public class TestJoin {
    static int x=0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            x=100;
        });
        t1.start();
        t1.join(1001);//等待调用进程1001ms，若线程还没有运行完，则不在等待，继续往下执行
        System.out.println(x);
    }
}
