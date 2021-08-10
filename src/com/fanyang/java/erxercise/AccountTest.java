package com.fanyang.java.erxercise;/**
 * @author fanYang
 * @create 2021-07-27 8:47
 */

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 08:47
 */
class Account {
    private static double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double money) {
        if (money > 0) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance += money;
            System.out.println(Thread.currentThread().getName()+"存钱成功,现有余额为"+balance);
        }
    }
}

class CustomerAccount implements Runnable {
    private Account account;
    ReentrantLock lock =new ReentrantLock();//同步锁

    public CustomerAccount(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                lock.lock();
                account.deposit(1000);
            }
            finally {
                lock.unlock();
            }
        }
    }
}

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(1000);
        CustomerAccount customer1 = new CustomerAccount(account);
        Thread thread1 = new Thread(customer1);
        Thread thread2 = new Thread(customer1);
        thread1.setName("甲");
        thread2.setName("乙");
        thread1.start();
        thread2.start();
    }
}
