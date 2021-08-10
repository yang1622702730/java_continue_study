package com.fanyang.java.collection;

import org.junit.Test;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-05 18:55
 */
public class CollectionTest {

    /*
     * @Description: 集合的add方法和addAll方法，size方法，isEmpty方法的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 19:02
     */
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("sad");//添加一个元素到集合中
        collection.add("sgfsag");
        collection.add(12414);//自动装箱为Integer类，该类继承与Object类
        collection.add(new Date());
        System.out.println(collection.size());//返回集合有元素的个数
        Collection collection1 = new ArrayList();
        collection1.add(134);
        collection1.add(21414);
        collection1.addAll(collection);//添加一个集合的所有元素到一个新的集合中
        System.out.println(collection1.size());
        System.out.println(collection1.isEmpty());//判断当前集合是否有元素
    }

    /*
     * @Description: 集合中的contains方法和containsAll方法的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 19:41
     */
    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        collection.add(new Person("fanYang", 21));
        collection.add(false);
        collection.add(new String("fanYang"));
        System.out.println(collection.contains(123));//用==去判断是否包含这个值
        System.out.println(collection.contains(new String("fanYang")));//调用的是String的equals方法，而且String已经重写此方法，因而比较的是字符串的内容
        System.out.println(collection.contains(new Person("fanYang", 21)));//没有重写equals方法，因而是用Object类中未重写的equals方法==比较二者的值，而且这儿是引用数据类型，所以比较的是地址值，所以返回false
        Collection collection1 = Arrays.asList(123, 1213123);//返回的List也是属于Collection的子类，体现了多态
        System.out.println(collection.containsAll(collection1));//判断collection1的元素是不是都在collection这个集合中
        int[] ints = new int[]{1,2,3,4,5,6,7};
        Collection collection2 = Arrays.asList(ints);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection2);
        System.out.println("***********");
        System.out.println(arrayList);

        System.out.println("***********");
        System.out.println(collection2.toString());
    }

    /*
     * @Description: 测试remove方法和removeAll方法
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 20:13
     */
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        collection.add(new Person("fanYang", 21));
        collection.add(false);
        collection.add(123);
        collection.add(new String("fanYang"));
        System.out.println(collection.size());
        System.out.println(collection.remove(123));//移除集合中第一次出现的123这个值，在内部的处理中，还时通过equals这个方法去查找这个值
        System.out.println(collection.size());
        Collection collection1 = Arrays.asList(123, 1213123);
        System.out.println("**************");
        System.out.println(collection.size());
        System.out.println(collection.removeAll(collection1));//移除集合A中与集合B中相同的所有元素，如若有些元素出现多次，都得被移除掉,直接在进行移除的集合进行了操作
        System.out.println(collection.size());
        System.out.println(collection);
    }

    /*
     * @Description: retainAll方法和equals方法的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 20:15
    */
    @Test
    public void test4() {
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        collection.add(1213123);
        collection.add(123);
        collection.add(new Person("fanYang", 21));
        Collection collection1 = Arrays.asList(123, 1213123);
        collection.retainAll(collection1);//直接对进行判断集合中是否有这些值，并且把符合条件的所有值都保留在当前集合，其余额移除掉
        System.out.println(collection);
        System.out.println("**************");
        Collection collection2 = new ArrayList();
        collection2.addAll(collection);
        System.out.println(collection2);
        System.out.println(collection2.equals(collection));//判断这两个集合的元素是否相等,并且要求实现List接口的集合元素的顺序也得相同(实现Set接口的集合元素对顺序没有要求)，不然返回false
    }
    
    /*
     * @Description: hashCode方法和toArray方法的测试
     * @Param: []
     * @return: void
     * @author: FanYang
     * @time: 2021/8/5 20:31
    */ 
    @Test
    public void test5(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add("safsf");
        System.out.println(collection.hashCode());//返回当前对象的哈希值
        collection.add(1213123);
        System.out.println(collection.hashCode());
        collection.add(123);
        collection.add(new Person("fanYang", 21));
        System.out.println(collection.hashCode());
        Object[] objects = collection.toArray();//集合转化为数组
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
//        List<Object> objects1 = Arrays.asList(objects);
////        System.out.println(objects.length);
        List<String> strings = Arrays.asList(new String[]{"AA","BB","CC","AA"});
        System.out.println(strings);
        System.out.println("***********");
        List<int[]> ints = Arrays.asList(new int[]{123, 411, 214});
        System.out.println(ints);
        List<Integer> integers = Arrays.asList(new Integer[]{123, 411, 214});
        System.out.println(integers);
        Integer[] integers1 = {123, 411, 214};
        System.out.println(integers.toString());
        System.out.println(ints.toString());
    }
}
