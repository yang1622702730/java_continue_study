package com.fanyang.java.testdate;

import org.junit.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 11:04
 */
public class ReviewTime {
    //方式一
    @Test
    public void test1() throws ParseException {
        String s = "2017-08-16";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse(s);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
    //https://www.cnblogs.com/zhuwenjoyce/p/12693359.html  可以查看网页讲解
    //方式二
    @Test
    public void test2(){
        String s = "2017-08-16";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(s,dateTimeFormatter);
        System.out.println(localDate);
        java.sql.Date date = java.sql.Date.valueOf(String.valueOf(localDate));
        System.out.println(date.toString());
    }
}
