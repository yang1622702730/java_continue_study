package com.fanyang.java.exerciese;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 09:53
 */
public class Exercise1 {
    @Test
    public void solution1() {
        List list = new ArrayList();
        int[] ints = new int[]{1, 23, 0, 0, 13, 56, 25, 14, 0, 0};
        for (int i = 0; i < ints.length; i++) {
            list.add(ints[i]);
        }
        System.out.println(list.toString());
        Collection collection = Arrays.asList(0);
        list.removeAll(collection);
        System.out.println(list);
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
