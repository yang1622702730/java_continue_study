package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:正则表达式的实例
 * @author: FanYang
 * @create_date: 2021-08-04 20:37
 */
public class RegexpExample {
    /*
     * @Description: 判断是不是汉字
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:39
     */
    @Test
    public void chineseCharacters() {
//        String content = "韩顺平a教育";//不满足格式
        String content = "韩顺平教育";
        String regStr = "^[\u0391-\uffe5]+$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
    
    /*
     * @Description: 验证邮政编码 1.是一个1-9开头的六位数
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:48
    */ 
    @Test
    public void postalCode(){
        String content = "345455";
//        String content = "34545d5";//不满足格式
        String regStr = "^[1-9]\\d{5}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }

    /*
     * @Description: 验证qq号的的规范性
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:50
    */
    @Test
    public void verifyQQ(){
        String content = "1622702730";
        String regStr = "^[1-9]\\d{5,9}$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
    /*
     * @Description: 电话号码的规范13/14/15/18开头的11位整数
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:58
    */
    @Test
    public void phoneNumber(){
        String content = "18723369961";
//        String regStr = "^(13|14|15|18)\\d{9}$";//方法一
        String regStr = "^1(3|4|5|8)\\d{9}$";//方法二
//        String regStr = "^1[3458]\\d{9}$";//方法三
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
    @Test
    public void UrlTest(){
        String content = "www.liaoxuefeng.com/wiki/1252599548343744/1306046706483233";
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(/([\\w-?/.=&%]*)*)$";//第一个?号表示开头部分可有可无
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
