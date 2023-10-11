package com.coder;

import static com.coder.M.sleep;

public class TestDaemon {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            while(true){
                System.out.println("守护线程执行中。。。。。。");
                sleep(1);
            }
        });
        t1.setDaemon(true);
        t1.start();
        sleep(3);
        System.out.println("主线程结束");
    }
}
