package com.fanyang.java.exercise;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 15:26
 */
public class Test1 {


    /*
     * @Description: 测试按出生日期来排序，在创建对象的时候实现Comparator接口的Compare方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/9 16:25
     */
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println("ddddddd");
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee employee1 = (Employee) o1;
                    Employee employee2 = (Employee) o2;
                    MyDate myDate1 = employee1.getBirthday();
                    MyDate myDate2 = employee2.getBirthday();
                    int compare1 = Integer.compare(myDate1.getYear(), myDate2.getYear());
                    if (compare1 != 0) {
                        return compare1;
                    } else {
                        int compare2 = Integer.compare(myDate1.getMonth(), myDate2.getMonth());
                        if (compare2 != 0) {
                            return compare2;
                        } else {
                            int compare3 = Integer.compare(myDate1.getDay(), myDate2.getDay());
                            if (compare3 != 0) {
                                return compare3;
                            }
                            return 0;
                        }
                    }
                }
//                return 0;
                throw new RuntimeException("传入的数据类型不对");
            }

        });
        treeSet.add(new Employee("liudehua", 20, new MyDate(1999, 10, 16)));
        treeSet.add(new Employee("zhang", 21, new MyDate(1999, 10, 15)));
        treeSet.add(new Employee("guo", 22, new MyDate(1979, 10, 15)));
        treeSet.add(new Employee("liming", 18, new MyDate(1969, 10, 15)));
        treeSet.add(new Employee("liangchaowei", 17, new MyDate(1959, 10, 15)));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*
     * @Description: 按照姓名来排序，在Employee类中实现Comparable的compareTo这个方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/9 16:26
     */
    @Test
    public void test2() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Employee("liudehua", 20, new MyDate(1999, 10, 16)));
        treeSet.add(new Employee("zhang", 21, new MyDate(1999, 10, 15)));
        treeSet.add(new Employee("guo", 22, new MyDate(1979, 10, 15)));
        treeSet.add(new Employee("liming", 18, new MyDate(1969, 10, 15)));
        treeSet.add(new Employee("liangchaowei", 17, new MyDate(1959, 10, 15)));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
