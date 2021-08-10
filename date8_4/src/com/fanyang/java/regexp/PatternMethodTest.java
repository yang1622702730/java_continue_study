package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 00:40
 */
public class PatternMethodTest {
    /*
     * @Description: 整体匹配
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 0:42
    */ 
    @Test
    public void testMatchers(){
        String content = "18723369961";
        String regStr = "^1(3|4|5|8)\\d{9}$";
        System.out.println(Pattern.matches(regStr,content));//该方法是整体匹配，只有全部的规则满足，并且从最左到最右都匹配，才能返回true,否则都返回false,find是局部检测，局部有满足的都能够返回true
    }

}
