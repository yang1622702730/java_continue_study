package com.fanyang.java.synchronization;/**
 * @author fanYang
 * @create 2021-07-26 15:13
 */

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-26 15:13
 */
public class ThreadSynchronized extends Thread {
    private static int tickets = 100;
    private static Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "真在买第" + tickets + "张票");
                    tickets--;
                } else {
                    System.out.println("票已经卖完了");
                    break;
                }
            }
        }
    }
}
class Test2{
    public static void main(String[] args) {
        ThreadSynchronized threadSynchronized1 = new ThreadSynchronized();
        ThreadSynchronized threadSynchronized2 = new ThreadSynchronized();
        threadSynchronized1.setName("窗口一");
        threadSynchronized2.setName("窗口二");
        threadSynchronized1.start();
        threadSynchronized2.start();
    }
}
