package com.fanyang.test;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 18:53
 */
public class Test1 {
    @Test
    public void test1(){
        String str = "999";
        int num = Integer.parseInt(str);
        Integer integer = Integer.parseInt(str);
        System.out.println(num + "    "+ integer);//999    999
        boolean b = Boolean.parseBoolean(str);//当str！=“true”，不区分大小写,皆为false
        System.out.println(b);//false
    }
    @Test
    public void test2(){
        int num = 9;
        Integer integer = new Integer(10);
        // 方式1 利用数据类型的自动提升
        String str1 = num+"";
        String str3 = integer +"";
        // 方式2 调用ValueOf()
        String str2 = String.valueOf(num);
        String str4 = String.valueOf(integer);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
