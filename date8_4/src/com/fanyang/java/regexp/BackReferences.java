package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:分组，捕获，反向引用
 * @author: FanYang
 * @create_date: 2021-08-05 08:59
 */
public class BackReferences {
    /*
     * @Description: 找出ABBA结构的整数
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 9:03
     */
    @Test
    public void test1() {
        String content = "1991  ad182281dfsdf 11892";
        String regStr = "(\\d)(\\d)\\2\\1";// 这儿的\\2代表的是第二个分组的id值，\\1代表的是第一个分组的id值
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
            System.out.println(matcher.start());//返回找到字符的起始索引值
            System.out.println(matcher.end());//返回找到字符的结束索引值
        }
    }

    /*
     * @Description: AAAAA结构的整数结构
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 9:04
     */
    @Test
    public void test2() {
        String content = "11111";
        String regStr = "(\\d)\\1{4}";// \\1代表的是第一个分组的id值,{4}代表的是出现四次
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
            System.out.println(matcher.start());//返回找到字符的起始索引值
            System.out.println(matcher.end());//返回找到字符的结束索引值
        }
    }
    /*
     * @Description: 检索一个前面五位数加个-后面九位数连续的三位数要相同的字符串如：12321-333999111
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 9:07
    */ 
    @Test
    public void test3() {
        String content = "12321-333999111";
//        String regStr = "^\\d{5}-\\d\\1{2}\\d\\2{2}\\d\\3{2}$";
        String regStr = "^\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}$";
//        String regStr = "^(\\d{5})-(\\d\\1{2})";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
            System.out.println(matcher.start());//返回找到字符的起始索引值
            System.out.println(matcher.end());//返回找到字符的结束索引值
        }
    }

    /*
     * @Description: 结巴去重
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 11:44
    */
    @Test
    public void test4(){
        String content = "我...我要...学学学学...编程java";
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        content= matcher.replaceAll("");
        regStr = "(.)\\1+";
        System.out.println(content);
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(content);
       content = matcher.replaceAll("$1");
        System.out.println(content);
    }

}
