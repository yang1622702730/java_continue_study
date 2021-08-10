package com.fanyang.java.exercise;


import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:1. 模拟一个trim方法，去除字符串两端的空格。
 * @author: FanYang
 * @create_date: ${}-07-30 16:22
 */
public class Exercise1 {
    public String trims(String str){
        int len = str.length();
        int start = 0;
        int end = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i)!=' '){
                start = i;
            }
        }
        for (int i = len-1; i >=start ; i--) {
            if (str.charAt(i)!=' '){
                end = i;
            }
        }
        return str.substring(start,end+1);
    }
    @Test
    public void test(){
        System.out.println(trims("  abc  def   "));
    }
}
