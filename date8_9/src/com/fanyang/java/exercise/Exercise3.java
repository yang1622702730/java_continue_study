package com.fanyang.java.exercise;

import org.junit.Test;

import java.time.ZoneOffset;
import java.util.HashSet;

/**
 * @project_name: continue_study01
 * @project_description:金典面试题：考虑HashSet的添加和删除细节，考查的底层原理
 * @author: FanYang
 * @create_date: 2021-08-09 16:43
 */
public class Exercise3 {
    @Test
    public void test1(){
        HashSet hashSet = new HashSet();
        Person person1 = new Person(1001, "AA");
        Person person2 = new Person(1002,"BB");
        hashSet.add(person1);
        hashSet.add(person2);
        System.out.println(hashSet);
        person1.setName("CC");
//        Person person3 = new Person(1001, "CC");
//        hashSet.add(person3);
        hashSet.remove(person1);//此时在计算person1的hash值已经改变，但是person1存储的位置没有改变，所以他会删除新的hash值对应的元素，
        //如果加上上面两行注释的代码，他就会把这个元素删除，因为他所在的位置就是根据此时的person1计算出来的hash值
        System.out.println(hashSet);
        Person person3 = new Person(1001, "CC");
        hashSet.add(person3);
        System.out.println(hashSet);
        Person person4 = new Person(1001, "AA");//由于person1的存储位置没有改变，但是hash值已经改变，所有person4计算出来的存储位置虽然与person1相同，但是
        //他们二者的equals已经不一样了,所以可以在person1元素后面链接这个元素。
        hashSet.add(person4);
        System.out.println(hashSet);
    }
}
