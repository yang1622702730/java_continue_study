package com.fanyang.java.regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-04 15:07
 */


// 查找过程：
// 1. 根据指定的规则，定位满足规则的字符串，比如2000
// 2. 找到后将 子字符串的开始索引 group[0]=0 记录到 matcher 对象的 int[] groups数组中；下一次查找的时候group[0]重新指向新的初始位置，group[1]重新指向新的结束位置，在这儿的话group[0]=65,group[1]=69
// 3. 同时记录oldLast 的值为 子字符串的结束的 索引+1的位置值索引 group[1]=4，下次执行find是，就从记录的索引开始匹配
// 4. 如果matcher.group(i)，i超过了范围，就会报索引越界异常，因为 getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
// 5. 继续向下找的时候同理, 找到后将 子字符串的开始索引记录 group[0]=65 到 matcher 对象的 int[] groups数组中；同时记录oldLast 的值为 子字符串的结束的 索引+1的位置值索引为group[1]=69，下次执行find是，就从记录的索引开始匹配
public class RegexpTest1 {
    @Test
    public void test1() {

        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。2001年9月24日，J2EE1.3发布。"
                + "2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升，与J2SE1.3相比，其多了近62%的类和接口。在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、全新的I/OAPI、正则表达式、日志与断言。" +
                "2004年9月30日，J2SE1.5发布，成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE 1.5更名为Java SE 5.0（内部版本号1.5.0），" +
                "代号为“Tiger”，Tiger包含了从1996年发布1.0版本以来的最重大的更新，其中包括泛型支持、基本类型的自动装箱、改进的循环、枚举类型、" +
                "格式化I/O及可变参数。";

        Pattern compile = Pattern.compile("\\d\\d\\d\\d");
        Matcher matcher = compile.matcher(content);
        System.out.println(matcher.matches());
        while (matcher.find()) {
//            group源码的实现
//             public String group(int group) {
//                     if (first < 0)
//                         throw new IllegalStateException("No match found");
//                     if (group < 0 || group > groupCount())
//                         throw new IndexOutOfBoundsException("No group " + group);
//                     if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
//                         return null;
//                     return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();//这儿group是1的话，每一次执行的循环都会根据重新查找匹配的的起始group[0]对应索引值和group[1]对应索引值进行截取
//                 }
            System.out.println(matcher.group(0));
        }
    }

    @Test
    public void test2() {

        String content = "2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。2001年9月24日，J2EE1.3发布。"
                + "2002年2月26日，J2SE1.4发布。自此Java的计算能力有了大幅提升，与J2SE1.3相比，其多了近62%的类和接口。在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、全新的I/OAPI、正则表达式、日志与断言。" +
                "2004年9月30日，J2SE1.5发布，成为Java语言发展史上的又一里程碑。为了表示该版本的重要性，J2SE 1.5更名为Java SE 5.0（内部版本号1.5.0），" +
                "代号为“Tiger”，Tiger包含了从1996年发布1.0版本以来的最重大的更新，其中包括泛型支持、基本类型的自动装箱、改进的循环、枚举类型、" +
                "格式化I/O及可变参数。";

        Pattern compile = Pattern.compile("(\\d\\d)(\\d\\d)");//这种被()包起来的就叫分组。它的group规则有所改变，请看下面分析
//         什么是分组，比如 (\d\d)(\d\d) ,则会功能则表达式中有 () 表示分组，第一个 ()表示第1组，第二个()表示第2组...
//         1. 根据指定的规则，定位欸满足规则的子字符串(比如(20)(00))
//         2. 找到后将 子字符串的开始索引 group[0]=0 记录到 matcher 对象的熟悉 int[] groups数组中；
//         *  2.1 groups[0] = 0, 把该子字符串的结束的索引+1的值记录到 groups[1] = 4
//         *  2.2 记录1组()匹配到的子字符串 groups[2] = 0 groups[3] = 2
//         *  2.3 记录2组()匹配到的子字符串 groups[4] = 2 groups[5] = 4
//         *  2.4 如果有更多的分组，同理
//         *  2.5如果是下一组的话查找到的数据的话，同理
        Matcher matcher = compile.matcher(content);
        System.out.println(matcher.matches());
        while (matcher.find()) {
            //1.如果正则表达式有()即分组
            //2.取出匹配的字符串规则如下
            //3. group(0)表示匹配到的子字符串
            //4. group(1)表示匹配到的子字符串的第一组字串
            //5. group(2)表示匹配到的子字符串的第2组字串
            //6. ...但是分组的数不能越界，有几个x()就有几个group(x),超过的话就会越界，抛出异常

            System.out.println("找到：" + matcher.group(0));
            System.out.println("第一组()对应：" + matcher.group(1));//分析了group的源码可知，返回值为 return getSubSequence(groups[1 * 2], groups[1 * 2 + 1]).toString();
            System.out.println("第二组()对应：" + matcher.group(2));//分析了group的源码可知，返回值为 return getSubSequence(groups[2 * 2], groups[2 * 2 + 1]).toString();
//            System.out.println("第二组()对应："+matcher.group(3));//分组的时候只分了两组，因而会爆java.lang.IndexOutOfBoundsException: No group 3   的异常

        }
    }

    /*
     * @Description: 限定符的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/4 17:19
     */
    @Test
    public void test3() {

    }
}
