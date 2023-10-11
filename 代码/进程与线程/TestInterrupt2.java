package com.coder;

import java.util.concurrent.TimeUnit;

import static com.coder.M.sleep;

public class TestInterrupt2 {
    public static void main(String[] args) throws InterruptedException {
        /*Thread t1 = new Thread(() -> {
            System.out.println("子线程休眠");
            sleep(3);
        });
        t1.start();
        sleep(1);
        t1.interrupt();
        System.out.println(t1.isInterrupted());//false*/

        Thread t2=new Thread(()->{
            while (true){
                System.out.println("子线程执行循环");
                boolean b = Thread.currentThread().isInterrupted();//true
                if(b){
                    System.out.println("线程被打断");
                    break;
                }
            }
        });
        t2.start();
        sleep(0.3);
        t2.interrupt();
    }

}
