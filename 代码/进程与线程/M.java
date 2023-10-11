package com.coder;

import java.util.concurrent.TimeUnit;

public class M {
    public static void sleep(long second){
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("线程被中断");
            throw new RuntimeException(e);
        }
    }
    public static void sleep(Double second){
        try {
            TimeUnit.MILLISECONDS.sleep((int)(second*1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
