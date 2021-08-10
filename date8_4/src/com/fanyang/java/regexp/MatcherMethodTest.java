package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:整体匹配的测试
 * @author: FanYang
 * @create_date: 2021-08-05 00:50
 */
public class MatcherMethodTest {
    @Test
    public void test(){
        String content = "hello sdsd hello sadsad hello";
        String regStr = "(hello)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
            System.out.println(matcher.start());//返回找到字符的起始索引值
            System.out.println(matcher.end());//返回找到字符的结束索引值
        }
        //整体匹配方法，常用于去校验某个字符串是否满足某个规则
        System.out.println(matcher.matches());//等同于Pattern.matches(regStr,content)这个方法
        String replaceAll = matcher.replaceAll("凡凡");//根据规则把找到的字符串改为指定的字符串
        System.out.println(replaceAll);
        System.out.println(content);//原来的字符串没有改变
    }
}
