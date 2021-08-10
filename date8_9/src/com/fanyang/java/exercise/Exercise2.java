package com.fanyang.java.exercise;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description: 高效的去除列表中的重复数据
 * @author: FanYang
 * @create_date: 2021-08-09 16:30
 */
public class Exercise2 {
    /*
     * @Description: 由于set接口的实现类都是无序且不重复的，我们就利用去数据不重复这一特性，去把列表中的重复元素删除
     * @Param: [list]
     * @return: java.util.List
     * @author: FanYang
     * @time: 2021/8/9 16:36
     */
    public List removeDuplicateList(List list) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }

    @Test
    public void test() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(3);
        List list = removeDuplicateList(arrayList);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
