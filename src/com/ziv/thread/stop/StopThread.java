package com.ziv.thread.stop;

public class StopThread {
    public static void test1(){
        try {
            MyThread1 thread = new MyThread1();
            thread.start();
            thread.interrupt();
            System.out.println("线程已经停止："+thread.isInterrupted());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test1();
    }
}
