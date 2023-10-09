package com.coder;

public class Test02 {
    public static void main(String[] args) {
        //同步运行
      /*  FileUtil.readFile();
        System.out.println("运行主程序");*/
        //异步运行
        /*Thread t=new Thread(){
            @Override
            public void run() {
                FileUtil.readFile();
            }
        };
        t.start();*/
        new Thread(FileUtil::readFile).start();
        System.out.println("运行主程序");
    }
}
