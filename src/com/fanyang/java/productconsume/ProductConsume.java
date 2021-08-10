package com.fanyang.java.productconsume;/**
 * @author fanYang
 * @create 2021-07-27 16:11
 */

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 16:11
 */
class Clerk {
    private int production = 0;

    public synchronized void produceProduct() {

        if (production < 20) {
            production++;
            System.out.println(Thread.currentThread().getName() + ":开始生产第" + production + "个产品");
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consumeProduct() {

        if (production > 0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + production + "个产品");
            production--;
            notifyAll();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者真在消费产品");
        while (true) {
            try {
                sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}

public class ProductConsume {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);
        producer.setName("第一个生产者");
        consumer.setName("第一个消费者");
        consumer2.setName("第二个消费者");
        producer.start();
        consumer.start();
        consumer2.start();
    }
}


