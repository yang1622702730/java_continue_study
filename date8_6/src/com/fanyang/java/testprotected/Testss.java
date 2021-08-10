package com.fanyang.java.testprotected;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 11:18
 */
public class Testss implements Test1 {
    @Test
    public void test1(){
        Test1.super.defaultMethod();
    }
    public static void main(String[] args) {
        Test1.staticMethod1();
        Test1 test1 = new Testss();
        test1.defaultMethod();
    }
}
