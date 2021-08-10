package com.fanyang.java.compare;

import org.junit.Test;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-02 14:04
 */
public class Test1 {
    //comparable的接口使用举例
    @Test
    public void compareTest() {
        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("1", 40);
        goods[1] = new Goods("2", 50);
        goods[2] = new Goods("3", 30);
        goods[3] = new Goods("4", 20);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }

    @Test
    public void compareTest1() {
        String[] arr = new String[]{"AA", "CC", "KK", "MM", "GG", "JJ", "DD"};
        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String str1 = (String) o1;
                    String str2 = (String) o2;
                    return -str1.compareTo(str2);
                }
                return 0;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void compareTest2() {
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("1", 40);
        goods[1] = new Goods("2", 50);
        goods[2] = new Goods("1", 30);
        goods[3] = new Goods("4", 20);
        Arrays.sort(goods, new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods o11 = (Goods) o1;
                    Goods o22 = (Goods) o2;
                    if (o11.getName().equals(o22.getName())) {
                        return -Double.compare(o11.getValues(),o22.getValues());//名字相同则比较商品的价格，通过包装类重写的compare方法去比较值得大小
                    }
                    else{
                        return o11.getName().compareTo(o22.getName());//通过String类的compareTo方法去比较名称不相同的字符串大小
                    }
                }
                throw new RuntimeException("输入的数据类型不对");
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}
