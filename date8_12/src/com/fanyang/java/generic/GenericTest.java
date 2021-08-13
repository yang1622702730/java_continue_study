package com.fanyang.java.generic;

import org.junit.Test;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:泛型的测试
 * @author: FanYang
 * @create_date: 2021-08-12 14:10
 */
public class GenericTest {
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(78);
        list.add(78);
        list.add(80);
        list.add(100);
        list.add(40);
        list.add("AA");
        for (Object o : list) {
            int score = (Integer)o;//对于AA这个字符串会报错
            System.out.println(score);
        }
    }
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(78);
        list.add(80);
        list.add(100);
        list.add(40);
//        list.add("AA");//编译不通过，会爆红，在编译时就会进行类型检查，保证数据的安全
        for (Integer integer : list) {
            int score = integer;
            System.out.println(score);
        }
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test3(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("杨凡",22);
        map.put("小鱼",21);
        map.put("天博",21);
        map.put("李爽",22);
        map.put("熊猫",21);
        map.put("肖平",21);
        Set<Map.Entry<String, Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+value);
        }
    }
}
