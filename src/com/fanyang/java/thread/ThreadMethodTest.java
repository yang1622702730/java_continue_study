package com.fanyang.java.thread;

/**
 * @author fanYang
 * @create 2021-07-24 11:25
 */


class TestThreadMethod extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "偶数" + i);
            }
//            if (i%20==0){
//                this.yield();//释放当前cpu的执行权
//            }
        }
    }

    public TestThreadMethod(String name) {
        super(name);
    }

    public TestThreadMethod() {
    }
}

/**
 * @program: continue_study01
 * @description: 测试Thread常用的方法
 * @author: FanYang
 * @create: 2021-07-24 11:25
 */
public class ThreadMethodTest {
    public static void main(String[] args) throws InterruptedException {
        TestThreadMethod testThreadMethod = new TestThreadMethod();
        testThreadMethod.setName("线程一");//调用方法命名
        testThreadMethod.start();
        TestThreadMethod testThreadMethod1 = new TestThreadMethod("线程1111");//采用构造器的方式命名
        Thread.currentThread().setName("主线程");//给主线程命名
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "偶数" + i);
            }
            if (i == 20) {
                try {
                    testThreadMethod.join();//在线程a中调用线程b的join()方法，此时线程a进入阻塞状态，直到线程b执行完成，线程a才结束阻塞状态
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(testThreadMethod.isAlive());
    }
}
