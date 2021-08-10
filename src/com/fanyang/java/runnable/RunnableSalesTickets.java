package com.fanyang.java.runnable;

/**
 * @author fanYang
 * @create 2021-07-24 15:10
 */

class Windows1 implements Runnable {
    private int tickets = 100;
    @Override
    public void run() {

       while (true){
           if (tickets>0){
               System.out.println(Thread.currentThread().getName()+" "+tickets);
              tickets--;
           }else{
               break;
           }
       }
    }
}

/**
 * @program: continue_study01
 * @description: 使用Runnable实现售票，也存在线程安全问题
 * @author: FanYang
 * @create: 2021-07-24 15:10
 */
public class RunnableSalesTickets {
    public static void main(String[] args) {
        Windows1 windows1 = new Windows1();
        Thread thread1 = new Thread(windows1);
        Thread thread2 = new Thread(windows1);
        Thread thread3 = new Thread(windows1);
        thread1.setName("窗口一");
        thread2.setName("窗口二");
        thread3.setName("窗口三");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
