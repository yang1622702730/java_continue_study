package com.fanyang.java.testprotected;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 10:38
 */
public class Test {
    public static void main(String[] args) {
        Dad d = new Kid();
        System.out.println(d.num);
        Kid d1 = (Kid)d;
        System.out.println(d1.num);

        d.method();
        d.function();//使用变量去调用静态方法，其实相当于用变量类型的类名去调用
    }
}

class Dad {
    int num = 20;

    public void method() {
        System.out.println("我是父类方法");
    }

    public static void function() {
        System.out.println("我是父类静态方法");
    }
}

class Kid extends Dad {
    int num = 10;

    public void method() {
        System.out.println("我是子类方法");
    }

    public static void function() {
        System.out.println("我是子类静态方法");
    }
}
