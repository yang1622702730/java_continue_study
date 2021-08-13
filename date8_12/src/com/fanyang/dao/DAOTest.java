package com.fanyang.dao;

import org.junit.Test;

import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 15:28
 */
public class DAOTest {
    @Test
    public void test1(){
        CustomerDAO dao = new CustomerDAO();
        dao.add(new Customer());
        List<Customer> moreIndex = dao.getMoreIndex(0);
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.add(new Student());
        List<Student> moreIndex1 = studentDAO.getMoreIndex(1);

    }
}
