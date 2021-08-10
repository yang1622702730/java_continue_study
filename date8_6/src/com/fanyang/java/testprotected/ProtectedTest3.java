package com.fanyang.java.testprotected;

import com.fanyang.java.setinterface.TestProtected;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-09 09:39
 */
public class ProtectedTest3  extends TestProtected{
    public static void main(String[] args) {
        TestProtected testProtected = new TestProtected();
        testProtected.method1();
        testProtected.method2();
    }
}
