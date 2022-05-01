package com.study.thread;

public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new ThreadHello());
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                t.start();
                t.join();
            }
            System.out.println("我是大哥 say hi" + ",第" + i + "次");
        }
    }
}

class ThreadHello implements Runnable {
    private int count = 1;

    @Override
    public void run() {
        while (true) {
            System.out.println("我是小弟say hello" + ",第" + count + "次");
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
