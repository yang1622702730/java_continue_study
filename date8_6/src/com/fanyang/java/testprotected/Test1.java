package com.fanyang.java.testprotected;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 11:15
 */

public interface Test1 {
        static void staticMethod1(){
            System.out.println("接口中的静态方法");
        }
        default void defaultMethod(){
            System.out.println("接口中的默认方法，不需要重写");
        }
}

