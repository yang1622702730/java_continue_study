package com.fanyang.java.linkedlist;

import com.fanyang.java.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 14:03
 */
public class LinkedListTest {
    /*
     * @Description: ArrayList类的常用方法测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 14:03
    */
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add("AA");
        arrayList.add(new Person("ton",2));
        arrayList.add(123);
        System.out.println(arrayList.toString());
        arrayList.add(1,"BB");//指定位置添加，List类实现的方法
        System.out.println(arrayList.toString());
        List integers = Arrays.asList(1, 23, 45);
        arrayList.addAll(integers);//在集合末端添加新的集合
        arrayList.addAll(1,integers);//指定位置添加新的集合
//        arrayList.add(integers);//把一个整体当成一个数组元素添加
        System.out.println(arrayList.toString());
        System.out.println(arrayList.get(0));//获取集合中索引值为0的元素
    }
    /*
     * @Description: ArrayList类的常用方法测试
     * @Param:
     * @return:
     * @author: FanYang
     * @time: 2021/8/6 14:11
    */
    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(456);
        arrayList.add("AA");
        arrayList.add(new Person("ton",2));
        arrayList.add(123);
        System.out.println(arrayList.indexOf(456));//获取从头开始首次出现456这个值得索引位置
        System.out.println(arrayList.lastIndexOf(456));//获取从开始最后一次出现456这个值得索引位置
        System.out.println(arrayList.remove(3));//他与继承Collection接口的remove方法是重载的关系，二者的参数列表不同，这儿的参数列表是指的索引值，而后者的参数指的是元素值为多少
        System.out.println(arrayList);
        arrayList.set(3,"BB");//指定索引位置，添加元素
        System.out.println(arrayList);
        List list = arrayList.subList(0, 4);//返回一个从[0,4)的新集合
        System.out.println(list);
    }

}
