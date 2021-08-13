package com.fanyang.java.generic;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 15:36
 */
public class GenericTest3 {
    @Test
    public void test1(){
        Object object = null;
        String string = null;
        object = string;
        Object[] object1 = null;
        String[] string1 = null;
        object1 = string1;
//        List<Object> object2 = null;
//        List<String> string2 = null;
//        object2 = string2;
        //此时的object2和string2不具备子父类关系，编译不通过
    }
    @Test
    public void test2(){
        List<Object> object2 = null;
        List<String> string2 = null;
        List<?> list = null;
        list = object2;
        list = string2;
        print(object2);
        print(string2);
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
