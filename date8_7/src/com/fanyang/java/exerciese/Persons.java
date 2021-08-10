package com.fanyang.java.exerciese;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 11:14
 */
public class Persons {
    private String name;
    static int age;
    public Persons() {
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("name:"+name+" age:"+age);
    }

    public static void main(String[] args) {
        Person person = new Person();
    }

}
