package com.fanyang.java.callable;/**
 * @author fanYang
 * @create 2021-07-27 17:17
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: continue_study01
 * @description: jdk5之后新加的创建线程的方式
 * @author: FanYang
 * @create: 2021-07-27 17:17
 */
class NumberThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if (i%2==0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class CallableTest {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        FutureTask futureTask = new FutureTask(numberThread);
        new Thread(futureTask).start();
        new Thread(futureTask).start();
        try {
            Object sum = futureTask.get();//get方法的返回值为FutureTask构造参数Callable实现类重写的call()的返回值
            System.out.println("总和为"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
