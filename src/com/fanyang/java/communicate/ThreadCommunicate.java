package com.fanyang.java.communicate;/**
 * @author fanYang
 * @create 2021-07-27 15:28
 */

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * @program: continue_study01
 * @description:使用两个线程打印1-100，线程1和2交替打印
 * @author: FanYang
 * @create: 2021-07-27 15:28
 */

public class ThreadCommunicate {
    public static void main(String[] args) {
        Number number = new Number();
        Thread thread1 = new Thread(number);
        Thread thread2 = new Thread(number);
        thread1.setName("线程A");
        thread2.setName("线程B");
        thread1.start();
        thread2.start();
    }

}

class Number implements Runnable {
    private int number = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
