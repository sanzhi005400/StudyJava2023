package com.lsj.Collection.Study_.HomeWork.HomeWork03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: 罗仕杰
 * @date: 2023/1/14 21:31
 * @description:
 */
/*1)使用HashMap类实例化一个Map类型的对象m，
键(String）和值(int)分别用于存储员工的姓名和工资，
存入数据如下:jack—650元; tom—1200元; smith——2900元;
2)将jack的工资更改为2600元
3)为所有员工工资加薪100元;
4)遍历集合中所有的员工
5)遍历集合中所有的工资*/
public class Homework03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        m.put("jack",2600);
        Set m1 = m.keySet();
        for (Object key:m1) {
            //更新工资
            m.put(key,(Integer)m.get(key)+100);
        }
        System.out.println(m);
        Iterator iterator = m1.iterator();
        while (iterator.hasNext()) {
            Object em =  iterator.next();
            System.out.println(em);
        }
        iterator = m1.iterator();
        while (iterator.hasNext()) {
            Object sal =  iterator.next();
            System.out.println(m.get(sal));
        }
    }
}
