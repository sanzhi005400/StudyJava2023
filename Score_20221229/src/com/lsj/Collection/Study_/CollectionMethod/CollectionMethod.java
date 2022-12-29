package com.lsj.Collection.Study_.CollectionMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 8:55
 * @description:
 */
/*ArrayList演示
 1add.添加单个元素
 2.remove删除指定元素
 3.contains查找元素是否存在
 4.size获取元素个数
 5.isEmpty判断是否为空
 6.clear清空
 7.addAll添加多个元素
 8.containsAll查找多个元素是否都存在
 9.removeAll删除多个元素
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //1add.添加单个元素
        list.add("java");
        list.add(10);//list.add(new Integer(10))
        list.add(true);
        System.out.println(list);
        //2.remove删除指定元素
        list.remove(0);//删除第一个元素
        System.out.println(list);
        list.remove(true);
        System.out.println(list);
        //3.contains查找元素是否存在
        System.out.println(list.contains(true));
        //4.size获取元素个数
        System.out.println(list.size());
        //5.isEmpty判断是否为空
        System.out.println(list.isEmpty());
        //6.clear清空
        list.clear();
        //System.out.println(list);
        //7.addAll添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("红楼梦");
        arrayList.add("三国演义");
        list.addAll(arrayList);
        System.out.println(list);
        //8.containsAll查找多个元素是否都存在
        System.out.println(list.containsAll(arrayList));
        //9.removeAll删除多个元素
        list.add("聊咋");
        list.removeAll(arrayList);
        System.out.println(list);
    }
}

