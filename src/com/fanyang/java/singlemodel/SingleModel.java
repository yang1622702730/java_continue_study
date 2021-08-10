package com.fanyang.java.singlemodel;/**
 * @author fanYang
 * @create 2021-07-26 22:45
 */

import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: continue_study01
 * @description:使用同步机制将懒汉式改为线程安全的
 * @author: FanYang
 * @create: 2021-07-26 22:45
 */
public class SingleModel {
    private SingleModel() {
    }

    private static SingleModel singleModel = null;
//    private ReentrantLock lock = new ReentrantLock();//ctrl+p可以查看当前类的构造器提供那些参数
    /*    public synchronized static SingleModel getInstance(){
            if (singleModel == null);
            {
                singleModel = new SingleModel();
            }
            return singleModel;
        }*/
    public static SingleModel getInstance() {

        //方式一：性能稍差，后面进来的进程也会进去再次判断
/*        synchronized (SingleModel.class) {
            if (singleModel == null) ;
            {
                singleModel = new SingleModel();
            }
            return singleModel;
        }*/
        //方式二：性能提升，只有最开始进入的线程会进入同步里面，后面的在第一个if语句哪儿就跳出去了
        if (singleModel == null) {
            synchronized (SingleModel.class) {
                if (singleModel == null) ;
                {
                    singleModel = new SingleModel();
                }
            }
        }
        return singleModel;
    }
}