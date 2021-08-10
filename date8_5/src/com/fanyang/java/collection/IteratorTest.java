package com.fanyang.java.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 23:05
 */
public class IteratorTest {
    
    /*
     * @Description: 集合元素的遍历模式，使用迭代器Iterator接口
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 23:07
    */ 
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        Iterator iterator = collection.iterator();
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());//超出范围抛异常*/
        //方式二，也不推荐
        /*for (int i = 0; i < collection.size(); i++) {
            System.out.println(iterator.next());
        }*/
        while(iterator.hasNext()){//判断集合内下一个元素是否还有值
            System.out.println(iterator.next());//最开始的next指针指向空，从第一次next开始，只要下一个位置有元素值，指针都会下移一位，并且将该位置上的元素值返回
        }
    }

    /*
     * @Description: 错误的示范
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 23:32
    */
    @Test
    public void test2(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        collection.add(123);
        Iterator iterator = collection.iterator();
        //错误的写法一
       /* while(iterator.next()!=null){//隔行输出，并且会抛出异常，每一次while判断都会导致指针下移一位，因而会少输出很多元素值
            System.out.println(iterator.next());
        }*/
        //错误的写法二
        while(collection.iterator().hasNext()){//这儿的话相当于每一次判断都重新创建了一个迭代器，因而每次的打印结果都为第一个位置上的元素，并且无法退出循环
            System.out.println(collection.iterator().next());
        }
    }
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        collection.add(123);
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
//            iterator.remove();//此时还没有调用next方法会爆异常
            Object object = iterator.next();
            if ("safsf".equals(object)){
                iterator.remove();//把字符串为safsf的集合元素移除掉
//                iterator.remove();//如果已经移除过一次了，再次移除会报错
            }
        }
        Iterator iterator1 = collection.iterator();//此时的迭代器iterator已经到底部了，需要重新为它指向一个新的迭代器或者重新创建新的对象
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }

}
