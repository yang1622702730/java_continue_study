package com.fanyang.java.exercise2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 16:48
 */
public class NewsTest {
    @Test
    public void test1(){
        News<String, String, String> stringStringStringNews1 = new News<>();
        News<String, String, String> stringStringStringNews2 = new News<>();
        News<String, String, String> stringStringStringNews3 = new News<>();
        stringStringStringNews1.setTitle("HHHHHHHHHHHHHHHHHHHH");
        stringStringStringNews2.setTitle("HHHHHHHHHHHHHHHHHHHH");
        stringStringStringNews3.setTitle("HHHHHHHHHHHHHHHHHHHHA");
        ArrayList<News> news = new ArrayList<>();
        news.add(stringStringStringNews1);
        news.add(stringStringStringNews2);
        news.add(stringStringStringNews3);
//        news.forEach(System.out::println);
        Iterator<News> iterator = news.iterator();
        while(iterator.hasNext()){
            News next = iterator.next();
        }
        List<News> news1 = news.subList(0,2);
        System.out.println(news1);
    }
}
