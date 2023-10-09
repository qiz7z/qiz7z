package com.coder;

public class Test03 {
    public static void main(String[] args) {
        /*System.out.println("main is start");
        MyRunnableImpl impl=new MyRunnableImpl();
        Thread thread=new Thread(impl);
        thread.start();
        System.out.println("main is end!");*/

        System.out.println("main start");
        new Thread(() -> {
            while (true){
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"线程1").start();
        System.out.println("main end");
    }
}
/*class MyRunnableImpl implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/
