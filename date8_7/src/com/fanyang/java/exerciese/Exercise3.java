package com.fanyang.java.exerciese;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-07 10:16
 */
public class Exercise3 {
    private  static String username = "1662702730@qq.com";
    private  static String password = "12345678";
    private static int limitTime = 3;
    private static boolean flag = true;

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String inputName = scanner.next();
        System.out.println("请输入密码");
        String inputPassword = scanner.next();
        if (username.equals(inputName) && password.equals(inputPassword)) {
            System.out.println("恭喜你登录成功");
            flag = false;
        } else {
            limitTime--;
            System.out.println("登录失败，还有"+limitTime+"次机会");
            if (limitTime==0){
                flag = false;
                System.out.println("机会用尽，没有机会了");
            }
        }
    }
    public static void menu(){
        System.out.println("正在加载登录页面");
        while (flag){
            login();
        }
    }

    public static void main(String[] args) {
        Exercise3.menu();
    }
}
