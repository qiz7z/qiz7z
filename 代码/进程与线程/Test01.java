package com.coder;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("主线程开始");
        MyThread m=new MyThread();
        m.start();//自动调用run方法，run不会在线程中开辟新的空间地址，会直接在主程序中运行，而且线程得名字都变成了main
        m.setName("first");
        MyThread m1=new MyThread();
        m1.start();
        m1.setName("second");
        MyThread m2=new MyThread();
        m2.start();
        m2.setName("third");
        System.out.println("end for main");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
