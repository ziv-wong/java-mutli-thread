package com.ziv.thread.stop;

public class MyThread2 extends Thread {
    @Override
    public void run(){
        super.run();
        try {
            for (int i = 0; i < 5000; i++) {
                if (this.isInterrupted())
                    throw new InterruptedException();
                System.out.println("i="+i);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
