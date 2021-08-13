package com.fanyang.java.exercise;

import java.util.*;

/**
 * @project_name: continue_study01
 * @project_description:
 * @author: FanYang
 * @create_date: 2021-08-12 16:23
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public void save(String id, T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }

    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList arrayList = new ArrayList();
        for (T value : values) {
            arrayList.add(value);
        }
        return arrayList;
    }

    public void delete(String id){
        map.remove(id);
    }

}
