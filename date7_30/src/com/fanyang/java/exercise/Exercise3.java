package com.fanyang.java.exercise;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:获取一个字符串在另一个字符串中出现的次数。比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 * @author: FanYang
 * @create_date: ${}-07-30 16:24
 */
public class Exercise3 {
    public int countChar(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int count = 0;
        int index = 0;
        if (len1 < len2) {
            //方式一
            /*while ((index = str2.indexOf(str1))!=-1){
                count++;
                str2 = str2.substring(index+1);
            }*/
            //方式二
            while ((index = str2.indexOf(str1, index)) != -1) {//这个方式不用每次循环都在字符串常量池中创建一个新的数据
                count++;
                index++;
            }
            return count;
        }
        return 0;
    }

    @Test
    public void test() {
        System.out.println(countChar("aba", "ababakkcadkabkebfkabkskab"));
    }
}
