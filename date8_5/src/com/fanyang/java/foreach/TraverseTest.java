package com.fanyang.java.foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 15:29
 */
public class TraverseTest {
    @Test
    public void test1(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(789);
        arrayList.add("DD");
        //方式一遍历集合
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**************");
        //方式二遍历集合
        for (Object o : arrayList) {
            System.out.println(o);
        }
        System.out.println("**************");
        //方式三遍历集合
        for (int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
