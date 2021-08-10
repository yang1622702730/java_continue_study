package com.fanyang.java.setinterface;

import com.fanyang.java.collection.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-06 15:55
 */
public class HashSet1 {

    /*
     * @Description: 测试Set接口存储的无序性，不可重复的特性
     * Set存储的数组在底层数组中并非按照数组的索引顺序添加，而是由数据的哈希值决定的
     * 不可重复性保证添加的元素按着equals方法判断时，不能返回true，既相同的元素只能添加一个。
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 15:59
     */
    @Test
    public void test1() {
        Set set = new HashSet();
        set.add(132);
        set.add(115);
        set.add(115);//添加无效，数据重复了
        set.add("dad");
        set.add(new User("yf", 23));
        set.add(new User("yf", 23));
        set.add("daddad");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /*Set接口等于数组+链表
     * @Description: （个人的见解，有点问题）不可重复性的实现原理为，从第一元素依次开始计算哈希值，如果此时的数组内没有任何的元素，此时利用哈希值进行某种高级的算法确定元素存放在数组中的位置（则利用哈希值%数组长度得到余数，余数就是对应的
     * 数组位置，便于理解，实际不是这种处理方式），这时第二个元素进来也先计算哈希值，如若哈希值与现有数组中的某个元素哈希值相同，则对二者进行equals操作，比较二者是否相同，如果相同则丢弃想要添加的元素，
     * 如果不相同则对这个元素也进行某种特殊的算法找到存放元素的位置（求余操作，便于理解），然后移动至对应的位置上，如果该位置上已经有元素占用了，但是哈希值不相同，则把该元素与现存的元素利用链表连接起来，（jdk8的话之前存的元素
     * 位于第一位，后面来的依次放在后面，jdk7把第新来的元素放在第一位，其余的依次后移），后面的元素也执行相同的操作
     * （正确的见解）
     * 我们向HashSet中添加元素a,首先调用元素a所在类的hashCode()方法，计算元素a的哈希值，
        此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置，判断
        数组此位置上是否已经元素：
            如果此位置上没其他元素，则元素a添加成功。 --->情况1
            如果此位置上其他元素b(或以链表形式存在的多个元素，则比较元素a与元素b的hash值：
                如果hash值不相同，则元素a添加成功。--->情况2
                如果hash值相同，进而需要调用元素a所在类的equals()方法：
                    equals()返回true,元素a添加失败
                    equals()返回false,则元素a添加成功。--->情况3

       注意点：
       * 对于添加成功的情况2和情况3而言：元素a 与已经存在指定索引位置上数据以链表的方式存储。
       * jdk 7 :元素a放到数组中，指向原来的元素。
       * jdk 8 :原来的元素在数组中，指向元素a
       总结：
       * 七上八下（jdk7添加新的元素到链表中都是放到数组中，然后把原来的数组内的元素链接起来，而jdk8改了，始终把第一个占用数组的元素放到第一位，后面来的都链接到后面）
     *
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/6 16:25
     */
    @Test
    public void test2() {

    }
}
