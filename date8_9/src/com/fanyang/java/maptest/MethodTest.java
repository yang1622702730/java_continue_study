package com.fanyang.java.maptest;

import org.junit.Test;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:HashMap的方法测试
 * @author: FanYang
 * @create_date: 2021-08-09 19:54
 */
public class MethodTest {


    /*
     * @Description: 元素添加和删除以及清空所有元素的方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/9 20:12
     */
    @Test
    public void test1() {
        HashMap hashMap = new HashMap();
        hashMap.put("AA", 123);
        hashMap.put("rad", 456);
        hashMap.put("CC", 12);
        hashMap.put("MM", 1144);
        hashMap.put("AA", 156);
        System.out.println(hashMap.toString());
        HashMap hashMap1 = new HashMap();
        hashMap1.put("EE", 123);
        hashMap1.put("FF", 123);
        hashMap1.put("DD", 123);
        hashMap1.put("CC", 124566);
        hashMap.putAll(hashMap1);
        System.out.println(hashMap.toString());
        Object cc = hashMap.remove("CC");
        System.out.println(cc);//返回key对应的values值
        Object cc1 = hashMap.remove("CCC");//删除一个不存在的键，返回null
        System.out.println(cc1);
        System.out.println(hashMap.toString());
        hashMap.clear();//把hashMap的所有元素都清空,并不是hashMap=null操作;
        System.out.println(hashMap.size());//0

    }


    /*
     * @Description: 元素查询的操作
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/9 20:11
     */
    @Test
    public void test2() {
        HashMap hashMap = new HashMap();
        hashMap.put("AA", 123);
        hashMap.put("BB", 123);
        hashMap.put("rad", 456);
        hashMap.put("CC", 12);
        Object rad = hashMap.get("rad");
        Object rad1 = hashMap.get("radddd");//如若没有这个key值，则返回null
        System.out.println(rad);
        System.out.println(rad1);
        boolean aa = hashMap.containsKey("AA");
        System.out.println(aa);
        boolean b = hashMap.containsValue(123);
        System.out.println(b);
        hashMap.clear();
        System.out.println(hashMap.isEmpty());//判断是否为空

        HashMap hashMap2 = new HashMap();
        hashMap2.put("AA", 123);
        hashMap2.put("BB", 123);
        hashMap2.put("rad", 456);
        hashMap2.put("CC", 12);
        System.out.println(hashMap.equals(hashMap2));
    }

    /*
     * @Description: 元视图操作的方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/9 20:22
     */
    @Test
    public void test3() {
        HashMap hashMap = new HashMap();
        hashMap.put("AA", 123);
        hashMap.put("BB", 123);
        hashMap.put("rad", 456);
        hashMap.put("CC", 12);
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("*************");
        Collection values = hashMap.values();
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("*************");
        Set set1 = hashMap.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
//            System.out.println(iterator1.next());
            Object next = iterator1.next();
            Map.Entry next1 = (Map.Entry) next;
            System.out.println(((Map.Entry) next).getKey());
            System.out.println(next1.getValue());
        }
    }
}
