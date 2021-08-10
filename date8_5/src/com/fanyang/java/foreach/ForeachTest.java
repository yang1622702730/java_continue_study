package com.fanyang.java.foreach;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 00:02
 */
public class ForeachTest {
    
    /*
     * @Description: foreach遍历集合
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 0:12
    */ 
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        //for (集合/数组元素的类型 局部变量 : 集合/数组对象)
        for (Object object : collection) {
            System.out.println(object);
        }
    }
    
    /*
     * @Description: foreach遍历数组
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 0:12
    */ 
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4};
        for(int i:arr){
            System.out.println(i);
        }
    }
    @Test
    public void test3(){
        String[] arr = new String[]{"MM","MM","MM"};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]="DD";
//        }//方式一
        for (String s : arr) {//这儿是arr把值赋给s，对s进行重新赋值并不是对arr的值进行修改
            s="DD";
            System.out.println(s);
        }//方式二
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
