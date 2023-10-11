package com.coder;

import java.util.concurrent.TimeUnit;

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("子线程开始");
            try {
                TimeUnit.SECONDS.sleep(1);//子线程休眠
            } catch (InterruptedException e) {
                System.out.println("子线程休眠被唤醒");
                throw new RuntimeException(e);
            }
            System.out.println("子线程结束");
        });
        t1.start();
        Thread.sleep(500);
        //t1.interrupt();//打断t1线程
    }
}
