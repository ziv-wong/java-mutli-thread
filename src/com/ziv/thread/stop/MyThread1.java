package com.ziv.thread.stop;

public class MyThread1 extends Thread{
    @Override
    public void run(){
        super.run();
        for (int i=0; i < 5000; i++){
//            if (this.isInterrupted()) break;
            System.out.println("i="+i);
        }
    }
}
