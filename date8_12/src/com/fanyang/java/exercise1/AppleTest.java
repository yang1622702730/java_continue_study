package com.fanyang.java.exercise1;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 16:43
 */
public class AppleTest {
    @Test
    public void test1(){
        Apple<String> stringApple = new Apple<>();
        stringApple.setWeight("500");
    }
    @Test
    public void test2(){
        Apple<Integer> integerApple = new Apple<>();
        integerApple.setWeight(500);
    }
    @Test
    public void test3(){
        Apple<Double> doubleApple = new Apple<>();
        doubleApple.setWeight(500.0);
    }
}
