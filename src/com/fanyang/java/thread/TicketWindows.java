package com.fanyang.java.thread;

/**
 * @author fanYang
 * @create 2021-07-24 14:41
 */


/*
 * @Description: 总票数一百张，三个窗口同时售卖,有线程安全问题
 * @Param:
 * @return:
 * @author: FanYang
 * @time: 2021/7/24 14:43
 */
class SalesWindows extends Thread {
    private static int tickets = 100;

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + "卖出" + tickets + "号票");
                tickets--;
            } else {
                System.out.println("票已经买完了，明天再来吧");
                break;
            }
        }
    }
}

/**
 * @program: continue_study01
 * @description: 售票窗口
 * @author: FanYang
 * @create: 2021-07-24 14:41
 */
public class TicketWindows {
    public static void main(String[] args) {
        SalesWindows salesWindows1 = new SalesWindows();
        SalesWindows salesWindows2 = new SalesWindows();
        SalesWindows salesWindows3 = new SalesWindows();
        salesWindows1.setName("窗口一:");
        salesWindows2.setName("窗口二:");
        salesWindows3.setName("窗口三:");
        salesWindows1.start();
        salesWindows2.start();
        salesWindows3.start();
    }
}
