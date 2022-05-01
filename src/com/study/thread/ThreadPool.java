package com.study.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(1);
        Runnable r1 = () -> {
            System.out.println("我是线程");
        };
        pool.submit(r1);
        pool.execute(r1);
    }
}
