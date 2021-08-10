package com.fanyang.java.testdate;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @project_name: continue_study01
 * @project_description:java.time包的时间测试
 * @author: FanYang
 * @create_date: 2021-08-02 10:41
 */
public class Test3 {
    @Test
    public void testTime() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
    }
    @Test
    public void testTime1(){
        LocalDateTime localDateTime = LocalDateTime.of(2021, 8, 1, 10, 50, 3);
        System.out.println(localDateTime);
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getHour());
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(22);
        System.out.println(localDateTime);//体现了local的不可变性
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2 = localDateTime.withYear(2022);
        System.out.println(localDateTime2);

        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime.plusDays(20);
        System.out.println(localDateTime4);
        LocalDateTime minus = localDateTime.minusDays(36);
        System.out.println(minus);

    }
}
