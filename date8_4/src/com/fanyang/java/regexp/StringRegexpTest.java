package com.fanyang.java.regexp;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 13:57
 */
public class StringRegexpTest {

    /*
     * @Description: String直接在replaceAll方法中使用正则表达式进行筛选，再替换。
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 14:00
     */
    @Test
    public void test1() {
        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。2001年9月" +
                "24日，J2EE1.3发布。2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升，与J2SE1.3相比，其多了近62%的类和接" +
                "口。在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、全新的I/OAPI、正则表达" +
                "式、日志与断言。2004年9月30日，J2SE1.5发布，成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE 1.5更名" +
                "为Java SE 5.0（内部版本号1.5.0）";
        content = content.replaceAll("JDK1.(3|4)", "JDK");
        System.out.println(content);

    }

    /*
     * @Description: 直接调用String字符串的matches方法传入要匹配的正则表达式规则，进行判断，符合规则，就返回true
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 14:03
     */
    @Test
    public void test2() {
        String content = "18723369961";
        if (content.matches("^(18|13)\\d{9}")) {
            System.out.println("格式匹配");
        } else {
            System.out.println("格式不匹配");
        }
    }

    /*
     * @Description: 使用String方法的spilt传入正则表达式对其按照规则进行分割
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 14:08
     */
    @Test
    public void test3() {
        String content = "hello#abc-jack123smith~北京";
        String[] split = content.split("(#|~|-|\\d+)");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
