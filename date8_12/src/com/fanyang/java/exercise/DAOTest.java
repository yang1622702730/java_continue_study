package com.fanyang.java.exercise;

import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 16:34
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1001",new User(1001,34,"周杰伦"));
        userDAO.save("1002",new User(1002,20,"孙燕姿"));
        userDAO.save("1003",new User(1003,35,"林俊杰"));
        userDAO.update("1003",new User(1003,40,"方文山"));
        userDAO.delete("1003");
        List<User> list = userDAO.list();
        //        System.out.println(list);
        list.forEach(System.out::println);
    }
}
