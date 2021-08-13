package com.fanyang.dao;

import java.util.List;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 15:23
 */
public class DAO1<T> {
    //添加一条记录
    public void add(T t){}
    //删除一条记录
    public boolean remove(T t){
        return false;
    }
    //修改一条记录
    public void update(T t){
    }
    //查询一条记录
    public T getIndex(int index){
        return null;
    }

    //查询多条记录
    public List<T> getMoreIndex(int index){
        return null;
    }
    public <E> E getValue(){
        return null;
    }
}
