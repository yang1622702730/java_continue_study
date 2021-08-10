package com.fanyang.java.maptest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 17:02
 */
public class MapTest1 {
    @Test
    public void test1() {
        Map map = new HashMap();
        map.put(null, null);
        /*Map map1 = new Hashtable();//Hashtable无法存储位null的键值对
        map1.put(null,null);
        map1.put(null,123);
        map1.put("asdad",null);*/
    }
}
