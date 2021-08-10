package com.fanyang.java.thread;/**
 * @author fanYang
 * @create 2021-07-24 10:51
 */

/**
 * @program: continue_study01
 * @description: 创建线程
 * @author: FanYang
 * @create: 2021-07-24 10:51
 */

class FirstThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"偶数"+i);//Thread.currentThread().getName()获取执行当前线程的线程名
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();//不在主线程中执行
//        firstThread.start();//同一个对象不能再次调用此方法，会爆ava.lang.IllegalThreadStateException，如果想要运行需要再次实例化一个对象在调用
//        firstThread.run();//这是直接调用重写的方法了，在主线程中执行
        for (int i = 0; i < 100; i++) {//在主线程中执行
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+"奇数"+i);//与上方调用的方法多线程执行
            }
        }
        System.out.println("hello");
    }
}