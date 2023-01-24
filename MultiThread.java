package org.practice;

public class MultiThread extends Thread {
    @Override
    public void run() {
        System.out.println("thread is running");

    }

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        t1.start();
    }
}
