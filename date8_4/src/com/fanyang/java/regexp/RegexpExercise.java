package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 14:08
 */
public class RegexpExercise {
    /*
     * @Description: 电子邮箱验证
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 14:09
    */
    @Test
    public void test1(){
        String content = "162270sdsd2730@sohdsusasda.or.com";
        String regStr = "^[\\w-]+@{1}([a-zA-Z]+\\.)+([a-zA-Z]+)$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    
    /*
     * @Description: 要求验证是不是整数和小数，考虑负数
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 15:50
    */ 
    @Test
    public void test2(){
//        String content = "-0.1";
//        String content = "15255.1";
//        String content = "15255.";//匹配不通过
//        String content = "-345";
//        String content = "003.45";//验证不通过
//        String content = "-0.45";
//        String content = "-003.45";//验证不通过
        String content = "10.1";
//        String content = "-123";
//        String content = "1.24";
//        String regStr = "^(-+)?([1-9]\\d*|0)\\.?\\d+$";//有点小BUG，0123这类的无法通过
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }
    
    /*
     * @Description: 解析Url的协议，端口，域名，文件名
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 16:24
    */ 
    @Test
    public void test3(){
        String content = "http://www.sohu.com:8080/abc/index.html";
//        String regStr = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w/-]*/([\\w@.$%]+)$";
        String regStr = "^([a-zA-Z]+)://(([a-zA-Z]+\\.)+[a-zA-Z]+):(\\d+)[\\w/-]*/([\\w@.$%]+)$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.matches()){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
//            System.out.println(matcher.group(3));
            System.out.println(matcher.group(4));
            System.out.println(matcher.group(5));
        }
        else{
            System.out.println("没有找到匹配项");
        }
    }
}
