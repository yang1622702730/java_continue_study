package com.fanyang.java.setinterface;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 17:12
 */
public class LinkedHashSet1 {
    /*
     * @Description: LinkedHashSet作为HashSet的子类，再添加数据的同时，每个数据还维护了两个引用，
     记录此数据前一个数据和后一个数据
     *
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 17:17
    */ 
    @Test
    public void test1(){
        Set set = new LinkedHashSet();
        set.add(132);
        set.add(115);
        set.add(115);//添加无效，数据重复了
        set.add("dad");
        set.add(new User("yf", 23));
        set.add(new User("yf", 23));
        set.add("daddad");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
