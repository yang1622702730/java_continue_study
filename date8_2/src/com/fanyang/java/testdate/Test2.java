package com.fanyang.java.testdate;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @project_name: continue_study01
 * @project_description:日历Calendar类的测试
 * @author: FanYang
 * @create_date: 2021-08-02 10:00
 */
public class Test2 {

    @Test
    public void testCalendar() {
        //1.实例化方式一
        //调用静态方法getInstance()
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());

        //get方法
        int days = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(instance.get(Calendar.DAY_OF_YEAR));

        //set方法
        instance.set(Calendar.DAY_OF_MONTH, 22);
        days = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add方法
        instance.add(Calendar.DAY_OF_MONTH, 3);//加上天数
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        instance.add(Calendar.DAY_OF_MONTH, -8);//减上天数
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

        //getTime()
        Date time = instance.getTime();
        System.out.println(time);

        //setTime()
        Date date = new Date();
        instance.setTime(date);
        days = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}


