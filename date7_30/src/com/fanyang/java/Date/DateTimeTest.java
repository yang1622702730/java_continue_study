package com.fanyang.java.Date;

import org.junit.Test;

import java.util.Date;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: ${}-07-30 14:38
 */
public class DateTimeTest {
    
    /*
     * @Description: System的currentTimeMillis()方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/30 14:40
    */ 
    @Test
    public void test1(){
//        long time = System.currentTimeMillis();
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    /*
     * @Description: java.util.Date类的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/30 14:41
    */
    @Test
    public void test2(){
        Date date = new Date();
        System.out.println(date.toString());//显示当前的年月日+具体时间  Fri Jul 30 14:42:37 GMT+08:00 2021
        System.out.println(date.getTime());
        Date date1 = new Date(1627627498529l);
        System.out.println(date1.toString());

    }

    /*
     * @Description:
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/7/30 14:50
    */
    @Test
    public void Test3(){
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }
}
