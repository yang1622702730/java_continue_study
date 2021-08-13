package com.fanyang.java.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:自定义泛型
 * @author: FanYang
 * @create_date: 2021-08-12 14:44
 */
public class Order<T> {
    String orderName;
    int orderId;
    T orderT;
    public Order(){}

    public Order(String orderName, int orderId, T orderT) {
        this.orderName = orderName;
        this.orderId = orderId;
        this.orderT = orderT;
    }
    
    
    //如下的三个方法都不是泛型方法
    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
    
    //泛型方法在方法中出现了泛型的结构，并且它的参数与类的泛型参数没有任何的关系
    public <E> List<E> copyFromArrayList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }

    public static <E> List<E> copyFromArrayLists(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e : arr) {
            list.add(e);
        }
        return list;
    }
//    public static void show(T orderT){
//        System.out.println(orderT);
//    }//编译不通过，因为静态随着类的加载而加载，此时的泛型还不确定，所以会报错
}
