package com.fanyang.java.exception;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 20:26
 */
public class ExceptionTest2 {
    public static long fact(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("出错了");
        }
        long r = 1;
        for (long i = 1; i <= n; i++) {
            r = r * i;
        }
        System.out.println("1123");
        return r;
    }
    @Test
    public void test1(){
        fact(-3);
    }

    public static void main(String[] args) {
        fact(-2);
    }
}
