package com.coder;

public class TestThreadState {
    public static void main(String[] args) throws InterruptedException {
        //线程创建，NEW，并且没有调用start方法运行
        /*Thread t1=new Thread(()-> System.out.println("线程1"));
        System.out.println(t1.getState());*/
        //RUNNABLE,有可能得到CPU时间片，也可能没得到，也有可能是阻塞状态
        /*Thread t2=new Thread(()-> {while(true){}});
        t2.start();
        System.out.println(t2.getState());*/

        /*Thread t2_1=new Thread(()->{
            FileUtil.readFile();
            FileUtil.readFile();
            FileUtil.readFile();
        },"t2_1");
        t2_1.start();
        System.out.println("主线程执行结束");
        System.out.println(t2_1.getState());*/

        //TERMINATED
        /*Thread t3=new Thread(()-> System.out.println("线程3"));
        t3.start();
        Thread.sleep(50);
        System.out.println(t3.getState());*/

        //TIMED_WAITING
        Thread t4=new Thread(()->{
            synchronized (TestThreadState.class) {//加锁
                try {
                    Thread.sleep(100000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t4.start();
        Thread.sleep(50);
        System.out.println(t4.getState());

        //WAITING
        /*Thread t5=new Thread(()->{
            try {
                t4.join();//等待这个线程死亡
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t5.start();
        Thread.sleep(50);
        System.out.println(t5.getState());*/

        //BLOCKED 阻塞状态 线程锁，与上边runable的阻塞不一样了
        Thread t6=new Thread(()->{
            synchronized (TestThreadState.class){
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t6.start();
        Thread.sleep(50);
        System.out.println(t6.getState());
    }
}
