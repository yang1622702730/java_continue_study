package com.fanyang.java.enmuexercise;

/**
 * @project_name: continue_study01
 * @project_description:练习一：创建月份枚举类，枚举值包含十二个月份，月份要求用英文单词
 * @author: FanYang
 * @create_date: 2021-08-11 14:04
 */
enum Month {
    JAN("ada"), FEB, MAR, APR, MAY, JUN, JUL, AUG, SEPT,OCT,NOV,DEC;
    String MONTHS;


    Month() {
    }

    Month(String MONTHS) {
        this.MONTHS = MONTHS;
    }

    public String getMONTHS() {
        return MONTHS;
    }
}
