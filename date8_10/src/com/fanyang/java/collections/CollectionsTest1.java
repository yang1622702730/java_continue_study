package com.fanyang.java.collections;

import org.junit.Test;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:Collections是提供Collection和Map的工具类
 * @author: FanYang
 * @create_date: 2021-08-10 14:09
 */
public class CollectionsTest1 {
    /*
     * @Description: Collections的常用方法测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/10 15:24
     */
    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(43);
        arrayList.add(46);
        arrayList.add(0);
        arrayList.add(-145);
        arrayList.add(-1);
        arrayList.add(-1);
        arrayList.add(-1);
        System.out.println(arrayList);
//        Collections.reverse(arrayList);//反转list中元素的位置
//        Collections.shuffle(arrayList);//打乱list中元素的位置，随机打乱
//        Collections.sort(arrayList);//调用的是Integer内的compareTo方法
//        Collections.swap(arrayList,0,5);//交换指定位置上的值
        Comparable max = Collections.max(arrayList);//返回list中元素的最大值,可以重写比较器
        System.out.println("Max =" + max);
        System.out.println(arrayList);
        int frequency = Collections.frequency(arrayList, -1);//查看指定的值出现的次数
        System.out.println("frequency = " + frequency);
//        ArrayList arrayList1 = new ArrayList();
//        Collections.copy(arrayList1,arrayList);//会抛出java.lang.IndexOutOfBoundsException: Source does not fit in dest这个异常，是因为
        // 此时的ArrayList1的没有初始化以及内部没有大于等于arrayList元素个数的元素值，源码解释如下
        // if (srcSize > dest.size())
        //          throw new IndexOutOfBoundsException("Source does not fit in dest");
        //我们有两种方法解决这个问题：
        //方法一：使用add添加大于等于要添加list元素的个数，但这个方法太麻烦了，如果数据很多的话，就很麻烦
//        System.out.println(arrayList1);
        //如下的方式为方法二，我们采用Arrays这个工具类的asList这个方法去构建一个长度为要添加的list的已经添加元素的个数的Object数组，然后返回一个已存储相同元素个数的新list
        List dest = Arrays.asList(new Object[arrayList.size()]);
        Collections.copy(dest, arrayList);
        System.out.println(dest);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(123);
        arrayList2.add(123);
        arrayList2.add(43);
        arrayList2.add(46);
        Collections.replaceAll(arrayList2, 123, 456);//arrayList2中所有的123替换成456
        System.out.println(arrayList2);
    }

    /*
     * @Description: 通过Collections类把各种集合转化为线程安全的
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/10 17:06
    */
    @Test
    public void test2(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(43);
        arrayList.add(46);
        arrayList.add(0);
        Collections.synchronizedList(arrayList);//把不安全的ArrayList转化为线程安全的ArrayList
    }
}
