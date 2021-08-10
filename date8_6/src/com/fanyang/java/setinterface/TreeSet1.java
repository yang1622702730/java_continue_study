package com.fanyang.java.setinterface;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 17:18
 */
public class TreeSet1 {

    /*
     * @Description: 向TreeSet中添加数据，要求是相同类的对象
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 17:19
     */
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(-1);
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(treeSet);
    }

    @Test
    public void test2() {
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add("B");
        treeSet1.add("G");
        treeSet1.add("cA");
        treeSet1.add("cK");
        treeSet1.add("j");
        treeSet1.add("e");
        Iterator iterator = treeSet1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(treeSet1);
    }
    @Test
    public void test3() {
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new User("ls",21));
        treeSet1.add(new User("yf",21));
        treeSet1.add(new User("YF",21));
        Iterator iterator = treeSet1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(treeSet1);
    }
}
