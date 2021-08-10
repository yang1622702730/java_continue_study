package com.fanyang.java.thread;/**
 * @author fanYang
 * @create 2021-07-24 11:18
 */


/**
 * @Description: 获取100以内的偶数
 * @Param: 
 * @return: 
 * @author: FanYang
 * @time: 2021/7/24 11:20
*/ 
class SecondThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"偶数"+i);
            }
        }
    }
}
/**
 * @Description: 获取100以内的奇数
 * @Param: 
 * @return: 
 * @author: FanYang
 * @time: 2021/7/24 11:20
*/ 
class ThirdThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+"奇数"+i);
            }
        }
    }
}
/**
 * @program: continue_study01
 * @description: 练习线程
 * @author: FanYang
 * @create: 2021-07-24 11:18
 */
public class ThreadExercise {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();
        secondThread.start();
        thirdThread.start();
    }
}

