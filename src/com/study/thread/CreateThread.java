package com.study.thread;

public class CreateThread {
    public static void main(String[] args) {
        Thread mt = new MyThread();
        mt.start();

        Thread mr = new Thread(new MyRunnable());
        mr.start();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我是MyThread线程");
    }
}


class MyRunnable implements Runnable {
    public void run() {
        System.out.println("我是MyRunnable线程");
    }
}