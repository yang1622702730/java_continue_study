package com.fanyang.java.lock;/**
 * @author fanYang
 * @create 2021-07-26 23:25
 */

import com.fanyang.java.synchronization.SynchronizedMethodRunnable;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-26 23:25
 */
public class LockTest implements Runnable {
    private int tickets = 100;
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while(true){
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + tickets);
                    tickets--;
                } else {
                    break;
                }
            }
            finally {
                lock.unlock();
            }
        }
    }
}
class Test5{
    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        Thread thread1 = new Thread(lockTest);
        Thread thread2 = new Thread(lockTest);
        thread1.setName("窗口一：");
        thread2.setName("窗口二：");
        thread1.start();
        thread2.start();
    }
}
