package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:演示元字符的使用
 * @author: FanYang
 * @create_date: 2021-08-04 15:59
 */
public class MetaCharacter {
    /*
     * @Description: 测试转义字符
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 16:00
     */
    @Test
    public void test1() {
        String context = "abc$(abc)(.123(";
//        String regStr = "\\(";  //如果不用\\则编译无法通过，在java中使用两个\代表转义符
//        String regStr = ".";//一个.代表的是匹配所有的字符,如果使用\\.则只会匹配'.'这一个字符
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(context);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    /*
     * @Description: 字符匹配符的测试
     * @Param:
     * @return:
     * @author: FanYang
     * @time: 2021/8/4 16:05
     */
    @Test
    public void test2() {
        String content = "a11c8ab.cABCaBCaB_@  cy";
//        String regStr = "[a-z]";//匹配a-z之间任意一个字符
//        String regStr = "[A-Z]";//匹配A-Z之间任意一个字符
//        String regStr = "abc";//匹配小写的abc字符串,这样是无法匹配大写ABC的
//        String regStr = "(?i)abc";//在前面添加(?i)就可以达到不区分abc大小写
//        String regStr = "a(?i)bc";//在前面添加(?i)就可以达到不区分bc大小写
//        String regStr = "a((?i)b)c";//在前面添加(?i)就可以达到不区分b大小写
//        String regStr = "[0-9]";//匹配0-9之间的数字
//        String regStr = "[^a-z]";//匹配不在小写a-z之间的字符
//        String regStr = "[^0-9]";//匹配不在0-9之间的字符
//        String regStr = "[abcd]";//匹配abcd之间的字符
//        String regStr = "[^abcd]";//不匹配abcd之间的字符
//        String regStr = "\\D";//匹配不在0-9之间的字符
//        String regStr = "\\w";//匹配任意英文字母，数字，下划线之间的字符,但是不包括特殊字符，相当于[a-zA-z0-9_]
//        String regStr = "\\W";//不匹配任意英文字母，数字，下划线之间的字符,匹配特殊字符,相当于[^a-zA-z0-9_]
//        String regStr = "\\s";//匹配任何空白字符
//        String regStr = "\\S";//匹配任何空白字符
//        String regStr = ".";//匹配除\n之外的所有字符
        String regStr = "\\.";//匹配字符'.'
        Pattern pattern = Pattern.compile(regStr);
//        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);//创建Pattern对象时加上Pattern.CASE_INSENSITIVE就表示不区分大小写，这儿的添加会对上面的匹配规则产生影响
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    /*
     * @Description: 选择匹配符的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 16:55
     */
    @Test
    public void test3() {
        String content = "hanshunping 杨 凡凡 哈哈哈 速度杀毒";
        String regStr = "han|杨|凡";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    /*
     * @Description: 限定符的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 18:31
     */
    @Test
    public void test4() {
        String content = "1111111aaaahello";
//        String regStr = "a{3}";//匹配3个字符a
//        String regStr = "1{4}";//匹配4个字符1
//        String regStr = "\\d{2}";//匹配2位的任意整数字符
//        String regStr = "a{3,4}";//匹配a字符至少3次，最多4次，java匹配时采用贪婪匹配，有多的，尽可能匹配多的
//        String regStr = "1{4,5}";//匹配a字符至少4次，最多5次,java匹配时采用贪婪匹配，有多的，尽可能匹配多的
//        String regStr = "\\d{2,5}";//匹配整数至少2次，最多5次
        String regStr = "\\d{2,}";//匹配整数至少2次，最多有多少返回多少
//        String regStr = "1+";//匹配一个1或者多个1
//        String regStr = "\\d+";//匹配1个整数或者多个整数
//        String regStr = "1*";//匹配零个1或者多个1
//        String regStr = "ah?";//匹配一个a或者一个ah字符
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    /*
     * @Description: 定位符的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 18:48
     */
    @Test
    public void test5() {
        String content = "123--abc";
//        String regStr = "^[0-9]+[a-z]*";//^表示最左边的字符，^符号表示后面跟的为开头的字符 +号表示至少有一个0-9的数字  *表示最少为0个，最多为无数个
//        String regStr = "^[0-9]+[a-z]+$";//$表示至少以什么结尾，这儿的意思是至少以一个小写字母结尾
        String regStr = "^[0-9]+\\-+[a-z]+$";//表示在中间至少用了一个-字符连接
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
        String content1 = "hanshunping hansphan nnhan";
//        String regStr1 = "han\\b";//\\b指的是空格前以han结尾或者是字符串末端以han结尾
        String regStr1 = "han\\B";//\\B指的是空格后以han开头或者是字符串开端以han开头的
        Pattern pattern1 = Pattern.compile(regStr1);
        Matcher matcher1 = pattern1.matcher(content1);
        while (matcher1.find()) {
            System.out.println("找到了" + matcher1.group(0));
        }
    }

    /*
     * @Description: 分组的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:10
     */
    @Test
    public void test6() {
        String content = "hanshunping s7724 nn4445han";
//        String regStr = "(\\d\\d)(\\d\\d)";
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";//命名分组的格式。
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
            System.out.println("第一个分组内容为:" + matcher.group(1));
            System.out.println("通过命名取到第一个分组内容为:" + matcher.group("g1"));
            System.out.println("第二个分组内容为:" + matcher.group(2));
            System.out.println("通过命名取到二个分组内容:" + matcher.group("g2"));
        }
    }

    /*
     * @Description: 非捕获分组的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:17
     */
    @Test
    public void test7() {
       String content =  "hello韩顺平教育韩顺平jack韩顺平老师韩顺平同学hello";
//       String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";//选择字符的方式
//        String regStr = "韩顺平(?:教育|同学|老师)";
//        String regStr = "韩顺平(?=教育|老师)";//只返回韩顺平教育和老师的韩顺平，不返回韩顺平同学的韩顺平
        String regStr = "韩顺平(?!教育|老师)";//不返回韩顺平教育和老师的韩顺平，只返回不包含前面两个规则的韩顺平
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }

    /*
     * @Description: 非贪婪匹配
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 20:32
    */
    @Test
    public void test8(){
        String content = "hello111111 ok";
//        String regStr = "\\d+";//默认是贪婪匹配
        String regStr = "\\d+?";//修改为非贪婪匹配，默认匹配短一点的字符
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到了" + matcher.group(0));
        }
    }
}
