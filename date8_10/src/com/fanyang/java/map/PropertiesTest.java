package com.fanyang.java.map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-10 11:54
 */
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream("jdbc.properties");//在测试方法内会提示找不到文件，要在主函数内读取文件
            properties.load(fileInputStream);
            String name = properties.getProperty("name");
            System.out.println(name);
            String password = properties.getProperty("password");
            System.out.println(password);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream!=null){
               try{
                  fileInputStream.close();
               }catch (IOException e){
                  e.printStackTrace();
               }
            }
        }
    }

}
