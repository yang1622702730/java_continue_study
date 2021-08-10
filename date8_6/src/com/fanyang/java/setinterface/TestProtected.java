package com.fanyang.java.setinterface;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 09:18
 */
public  class TestProtected {
    protected  static void method1(){
        System.out.println("protected可以访问");
    }
    public static void method2(){
        System.out.println("public可以访问");
    }
    static void method3(){
        System.out.println("缺省可以访问");
    }
    private static void method4(){
        System.out.println("private可以访问");
    }

    public static void main(String[] args) {
        TestProtected testProtected = new TestProtected();
        testProtected.method1();
        method2();
        method3();
        method4();
    }
}
