package com.fanyang.java.erxercise;/**
 * @author fanYang
 * @create 2021-07-27 15:14
 */

import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-27 15:14
 */
class Account1 {
    private static double balance;

    public Account1(double balance) {
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
            System.out.println(Thread.currentThread().getName() + "存钱成功,现有余额为" + balance);
        }
    }
}

class CustomerAccount1 extends Thread {
    private Account1 account1;
    private static ReentrantLock lock = new ReentrantLock();//同步锁

    public CustomerAccount1(Account1 account1) {
        this.account1 = account1;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                lock.lock();
                account1.deposit(1000);
            } finally {
                lock.unlock();
            }
        }
    }
}

public class AccountTest1 {
    public static void main(String[] args) {
        Account1 account1 = new Account1(0);
        CustomerAccount1 customerAccount1 = new CustomerAccount1(account1);
        CustomerAccount1 customerAccount2 = new CustomerAccount1(account1);
        customerAccount1.setName("丙");
        customerAccount2.setName("丁");
        customerAccount2.start();
        customerAccount1.start();
    }
}
