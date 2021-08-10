package com.fanyang.java;

import org.junit.Test;

import javax.swing.*;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-03 15:40
 */
public class EnumerateTest {

    public static void main(String args[]) {
        Enumerate enumerate = Enumerate.AUTUMN;
        System.out.println(enumerate);
        System.out.println(Enumerate.AUTUMN);
        System.out.println(Enumerate.SPRING);
        System.out.println(Enumerate.SUMMER);
        System.out.println(Enumerate.WINTER);
    }


}

class Enumerate {
    private final String seasonName;
    private final String seasonDesc;

    private Enumerate(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public static final Enumerate SPRING = new Enumerate("春天", "春暖花开");
    public static final Enumerate SUMMER = new Enumerate("夏天", "夏日炎炎");
    public static final Enumerate AUTUMN = new Enumerate("秋天", "秋高气爽");
    public static final Enumerate WINTER = new Enumerate("冬天", "白雪皑皑");

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Enumerate{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
