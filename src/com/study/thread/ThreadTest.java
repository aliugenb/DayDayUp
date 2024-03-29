package com.study.thread;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class TestThread extends Thread {
    private String name;

    TestThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(name);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

public class ThreadTest {
    public static void main(String[] args) {
//        new Thread(new com.study.thread.TestThread("aa")).start();
//        new Thread(new com.study.thread.TestThread("bb")).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("aaa");
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        new Thread(() -> {
//            System.out.println(System.currentTimeMillis());
//            System.out.println("bb");
//        }).start();
//
//        new Thread(() -> {
//            System.out.println(System.currentTimeMillis());
//            System.out.println("aa");
//        }).start();

        FutureTask<Integer> futureTask = new FutureTask<Integer>((Callable<Integer>)()->{
            int i = 0;
            for (; i < 10; i++) {
                System.out.println("i的值" + i);
            }
            return i;
        });
        new Thread(futureTask,"开始").start();
    }

}
