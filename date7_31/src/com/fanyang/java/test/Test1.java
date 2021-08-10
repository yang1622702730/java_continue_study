package com.fanyang.java.test;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: ${}-07-31 11:50
 */
public class Test1 {
    @Test
    public void test() {
        String s = "people";
        String t = "people";
        String[] c = {"p", "e", "o", "p", "l", "e"};
        System.out.println(s==t);
        System.out.println(s.equals(c));
        System.out.println(s.equals(t));
        System.out.println(t .equals(new String("people")));
        String s1 = "good";
        String t1 = s1.toLowerCase( );
        s1 +="student";
        System.out.println(s1);
        System.out.println(t1);
    }
    @Test
    public void test2(){
        String s[ ] = new String[5]; for(int i=0;i<5;s[i++]="");
        System.out.println(s.length);
        String s1[ ]={"", "", "", "", ""};
        System.out.println(s1.length);
    }
}
