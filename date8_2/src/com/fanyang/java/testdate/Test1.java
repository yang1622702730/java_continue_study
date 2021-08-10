package com.fanyang.java.testdate;

import com.fanyang.java.compare.Goods;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import static com.fanyang.java.compare.Goods.a;//静态属性
//import static com.fanyang.java.compare.Goods.test1;//静态方法
//import  static com.fanyang.java.compare.Goods.*;//可以同时调用静态方法和属性

/**
 * @project_name: continue_study01
 * @project_description:SimpleDateFormat类的测试
 * @author: FanYang
 * @create_date: 2021-08-02 09:20
 */
public class Test1 {
    @Test
    public void testSimpleDateFormat() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat();
        System.out.println(simpleDateFormat1.format(date));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//大写的HH是24小时制
        System.out.println(simpleDateFormat2.format(date));
        Date date1 = simpleDateFormat1.parse("21-8-2 上午9:23");
        System.out.println(date1);
        Date date2 = simpleDateFormat2.parse("2021-08-02 09:27:37");
//        Date date3 = simpleDateFormat1.parse("2021-08-02 09:27:37"); //格式不对，要使用SimpleDateFormat初始化构造器上面的格式，或者是默认的格式"21-8-2 上午9:23"这种
        System.out.println(date2);

    }

    //练习一；字符串“2020-09-08转换为java.sql.Date
    @Test
    public void testSimpleDateFormat1() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2020-09-08");//把这个格式转换为java.util.Date的格式
        System.out.println(date);
        System.out.println(date.getTime());//获取现在到1970年的毫秒之差
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }

    //练习二
    @Test
    public void testSimpleDateFormat2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = simpleDateFormat.parse("2020-09-08");
        Date date1 = simpleDateFormat.parse("1990-01-01");
        long i = date.getTime() - date1.getTime();
        System.out.println(i);
        long rightDay = i / 86400000;
        System.out.println(rightDay);
        if (rightDay % 5 <= 3 && rightDay % 5 > 0) {
            System.out.println("这天打鱼");
        } else {
            System.out.println("这天晒网");
        }


    }
}
