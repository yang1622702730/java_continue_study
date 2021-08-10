package com.fanyang.java.exercise;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 15:38
 */
public class ListExercise {

    /*
     * @Description: 去区分调用的是remove(int index)还是remove(Object obj)
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 15:44
     */
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        upDateList(arrayList);
        System.out.println(arrayList);

    }

    private static void upDateList(ArrayList list) {
//        list.remove(2);//默认认为这儿是索引值，而不是元素值
        list.remove(new Integer(2));//只有new一个对象才认为是删除这个元素，这是因为这儿直接输入2他无法完成自动装箱，只能自动去装箱
    }
}
