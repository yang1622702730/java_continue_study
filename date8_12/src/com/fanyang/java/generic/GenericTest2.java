package com.fanyang.java.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:自定义泛型类（Order）和泛型接口的测试
 * @author: FanYang
 * @create_date: 2021-08-12 14:47
 */
public class GenericTest2 {
    @Test
    public void test1() {
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("123");
        Order<String> stringOrder = new Order<>();
        stringOrder.setOrderT("2134");
    }

    @Test
    public void test2() {
        SunOrder sunOrder = new SunOrder();
        //由于子类在继承带泛型的父类时，父类指明了泛型类型，则实例化对象时，不再需要指明泛型类型
        sunOrder.setOrderT(123);
    }

    @Test
    public void test3() {
        SubOrder2<String> subOrder2 = new SubOrder2<>();
        subOrder2.setOrderT("1234");
//        subOrder2.setOrderT(1234);//报错
    }
    @Test
    public void test4(){
        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
//        list1 =list12;//他们二者是不能相互引用的，因为存储的内容不同
    }

    //泛型方法在调用时指明泛型参数的类型
    @Test
    public void test5(){
        Order<String> stringOrder = new Order<>();
        List<Integer> integers = stringOrder.copyFromArrayList(new Integer[]{1, 2, 3, 4});
        System.out.println(integers);
    }

    //泛型方法可以是静态，它的泛型参数不是由类去传入的
    @Test
    public void test6(){
        List<Integer> integers = Order.copyFromArrayLists(new Integer[]{1, 2, 3, 4});
        System.out.println(integers);
    }
}
