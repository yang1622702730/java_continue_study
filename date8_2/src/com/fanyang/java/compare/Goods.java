package com.fanyang.java.compare;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-02 15:00
 */
public class Goods implements Comparable {
    private String name;
    private int values;
    public  static int a = 10;

    public Goods() {
    }

    public Goods(String name, int values) {
        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", values=" + values +
                '}';
    }
    public static  void test1(int i){
    }
    public static void test1(int i,int j){
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Goods) {
            Goods goods = (Goods) o;
            if (this.values > goods.values) {
                return 1;
            } else if (this.values <goods.values){
                return -1;
            }
            else{
                return 0;
            }
        }
        throw new RuntimeException("传入的数据类型不一致"); }
}
