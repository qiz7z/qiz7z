package com.coder;

import java.util.Random;

public class FileUtil {
    public static void readFile(){
        int t=new Random().nextInt(2000);
        try{
            Thread.sleep(t);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("file reading is success,time is "+t+" ms");
    }
}
