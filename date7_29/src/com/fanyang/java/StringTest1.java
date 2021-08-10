package com.fanyang.java;

import org.junit.Test;

/**
 * @program: continue_study01
 * @description:
 * @author: FanYang
 * @create: 2021-07-29 18:53
 */
public class StringTest1 {
    @Test
    public void test1() {
        String s = "0";
        for (int i = 1; i <= 5; i++) {
            s += 1.5f;
        }
        System.out.println(s);
    }

    @Test
    public void test2() {
        String str2 = "good";
        String str1 = new String("good");
        String str3 = new String("good");
//        str1 = "test";
        System.out.println(str1);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.compareTo(str2));
    }

    @Test
    public void test3() {
        String str1 = "abc";
        String str2 = "def";
        String str3 = str1 + str2;
        System.out.println(str3.hashCode());
        System.out.println("abcdef".hashCode());
        System.out.println(str3 == "abcdef");
        System.out.println(str3.equals("abcdef"));
    }

    @Test
    public void test4() {
        final String a = new String("a");
        String b = a + "b"; // 堆里引用
        System.out.println(b);
        String ab = "ab";// 常量
        System.out.println(b == ab);// false
    }

}
