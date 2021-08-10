package com.fanyang.java.exerciese;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 10:02
 */
public class Exercise2 {

    /*
     * @Description: 采用迭代器的方式
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/7 10:06
     */
    @Test
    public void solution1() {
        ArrayList arrayList = new ArrayList();
        Collection collection = Arrays.asList(1, 2, 3, 4, 5);
        arrayList.addAll(collection);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
     * @Description: 采用foreach的方式遍历
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/7 10:06
     */
    @Test
    public void solution2() {
        ArrayList arrayList = new ArrayList();
        Collection collection = Arrays.asList(1, 2, 3, 4, 5);
        arrayList.addAll(collection);
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }

    /*
     * @Description: 采用for循环的方式遍历
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/7 10:06
     */
    @Test
    public void solution3() {
        ArrayList arrayList = new ArrayList();
        Collection collection = Arrays.asList(1, 2, 3, 4, 5);
        arrayList.addAll(collection);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
