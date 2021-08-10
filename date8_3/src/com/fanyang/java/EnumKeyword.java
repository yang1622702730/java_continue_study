package com.fanyang.java;

import org.junit.Test;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 15:54
 */
public class EnumKeyword {
    @Test
    public void test1() {
        Enumerate1[] enumerate = Enumerate1.values();//返回枚举类的常量数组
        for (int i = 0; i < enumerate.length; i++) {
            System.out.println(enumerate[i]);
        }
        Thread.State[] states = Thread.State.values();
        for (int i = 0; i < states.length; i++) {
            System.out.println(states[i]);
        }
        Enumerate1 spring = Enumerate1.valueOf("SPRING");//返回枚举类中对象名是WINTER的对象
        System.out.println(spring);
        spring.show();
    }

    public static void main(String[] args) {
        Enumerate1 summer = Enumerate1.SUMMER;
        System.out.println(summer);
        System.out.println(Enumerate1.class.getSuperclass());
    }
}
interface Info{
    void show();
}
enum Enumerate1 implements Info{
    SPRING("春天", "春暖花开"){//这种方式就好比创建类实例的时候，重写类的方法，但其作用范围只局限于当前对象
        @Override
        public void show() {
//            super.show();
            System.out.println("这是春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"),

    AUTUMN("秋天", "秋高气爽"),

    WINTER("冬天", "白雪皑皑");

    private final String seasonName;
    private final String seasonDesc;

    private Enumerate1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }

/*    @Override
    public String toString() {
        return "Enumerate1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }*/   //可以不重写toString方法,


    /* public String toString() {
        return name;//在java.lang.Enum类下面已经重写了toString方法
    }*/
}

