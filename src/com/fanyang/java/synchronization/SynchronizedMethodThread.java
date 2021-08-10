package com.fanyang.java.synchronization;/**
 * @author fanYang
 * @create 2021-07-26 22:33
 */

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-26 22:33
 */
public class SynchronizedMethodThread extends Thread{
    private static int tickets = 100;

    @Override
    public void run() {
        while (tickets > 0) {
            show();
        }
    }

    private static synchronized void show() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + "真在买第" + tickets + "张票");
            tickets--;
        }
    }
}
class Test4{
    public static void main(String[] args) {
        SynchronizedMethodThread synchronizedMethodThread = new SynchronizedMethodThread();
        Thread thread1 = new Thread(synchronizedMethodThread);
        Thread thread2 = new Thread(synchronizedMethodThread);
        thread1.setName("窗口一：");
        thread2.setName("窗口二：");
        thread1.start();
        thread2.start();
    }
}
