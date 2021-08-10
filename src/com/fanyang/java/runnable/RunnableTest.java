package com.fanyang.java.runnable;

/**
 * @author fanYang
 * @create 2021-07-24 14:56
 */

class FirstRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
        }
    }
}

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-24 14:56
 */
public class RunnableTest {
    public static void main(String[] args) {
        FirstRunnable firstRunnable = new FirstRunnable();
        Thread thread1 = new Thread(firstRunnable);
        Thread thread2 = new Thread(firstRunnable);
        thread1.start();
        thread2.start();

//        new Thread(new FirstRunnable()).start();//匿名方式
    }
}
