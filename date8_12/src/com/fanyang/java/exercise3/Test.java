package com.fanyang.java.exercise3;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 17:02
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("张三",800);
        map.put("李四",1500);
        map.put("王五",3000);
        map.put("张三",2600);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            Integer value = next.getValue();
            map.put(next.getKey(),value+new Integer(100));
        }
        System.out.println(map);
    }
}
