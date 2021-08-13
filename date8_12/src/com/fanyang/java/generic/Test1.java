package com.fanyang.java.generic;

import org.junit.Test;

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
        TreeSet<Employee> treeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                MyDate myDate1 =o1.getBirthday();
                MyDate myDate2 = o2.getBirthday();
                return myDate1.compareTo(myDate2);
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
        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.add(new Employee("liudehua", 20, new MyDate(1999, 10, 16)));
        treeSet.add(new Employee("zhang", 21, new MyDate(1999, 10, 15)));
        treeSet.add(new Employee("guo", 22, new MyDate(1979, 10, 15)));
        treeSet.add(new Employee("liming", 18, new MyDate(1969, 10, 15)));
        treeSet.add(new Employee("liangchaowei", 17, new MyDate(1959, 10, 15)));
        Iterator<Employee> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
