package com.fanyang.java.synchronization;/**
 * @author fanYang
 * @create 2021-07-26 10:10
 */

/**
 * @program: continue_study01
 * @description: synchronization的测试
 * @author: FanYang
 * @create: 2021-07-26 10:10
 */
public class SynchronizationTest implements Runnable {
    private int tickets = 100;
    Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized(object){
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
class Test {
    public static void main(String[] args) {
        SynchronizationTest synchronizationTest = new SynchronizationTest();
        Thread thread1 = new Thread(synchronizationTest);
        Thread thread2 = new Thread(synchronizationTest);
        thread1.setName("窗口一：");
        thread2.setName("窗口二：");
        thread1.start();
        thread2.start();
    }
}
