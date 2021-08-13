package com.fanyang.java.generic;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 15:26
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        int compare1 = Integer.compare(this.getYear(), o.getYear());
        if (compare1 != 0) {
            return compare1;
        } else {
            int compare2 = Integer.compare(this.getMonth(), o.getMonth());
            if (compare2 != 0) {
                return compare2;
            } else {
                int compare3 = Integer.compare(this.getDay(), o.getDay());
                if (compare3 != 0) {
                    return compare3;
                }
                return 0;
            }
        }
        }
    }
