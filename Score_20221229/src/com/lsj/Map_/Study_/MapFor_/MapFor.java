package com.lsj.Map_.Study_.MapFor_;

import java.util.*;

/**
 * @author: 罗仕杰
 * @date: 2023/1/11 15:55
 * @description:
 */
/*Map的六大遍历*/
    @SuppressWarnings({"all"})
public class MapFor {
    /*1.containsKey查找键值是否存在
    * 2.keySet获取所有的键
    * 3.entrySet获取所有关系
    * 4.values获取所有的值
    * */
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("邓超","孙俪");
        hashMap.put("王宝强","马蓉");
        hashMap.put("宋捷","马蓉");
        hashMap.put("刘凌波",null);
        hashMap.put(null,"刘亦菲");
        hashMap.put("鹿晗","关晓彤");

        //第一组：先取出所有的key，在通过k再取出对应的value
        Set KeySet = hashMap.keySet();
        //set接口的遍历有两种，是在set接口下的遍历方法
        // 一种通过迭代器
        System.out.println("==========迭代器========");
        Iterator iterator = KeySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(key + "-" + hashMap.get(key));
        }
        //一种通过增强for
        System.out.println("==========增强for========");
        for(Object key: KeySet){
            System.out.println(key + "-" + hashMap.get(key));
        }

        //第二组:把所有的values取出
        Collection values = hashMap.values();
        //这里可以使用所有Collection的所有遍历方法(普通for循环不行)
        //（1）增强for
        System.out.println("===取出所有的value==");
        for(Object key:values){
            System.out.println(key);
        }
        //(2)迭代器
        System.out.println("===第二个迭代器=====");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object key =  iterator1.next();
            System.out.println(key);
        }
        //普通for循环因为没有get方法所有不能调用

        //第三组：通过entrySet获取所有关系
        System.out.println("======使用entrySet的增强for=====");
        Set entrySet = hashMap.entrySet();//EntrySet<Map.EntryK,V>
        //(1)增强for
        for (Object entry :entrySet) {//entry是一个Node的接口
            //将entry对象转成一个Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
        //（2）迭代器
        System.out.println("======使用entrySet的迭代器====");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry =  iterator2.next();//取出来的对象本质是个HashMap&Node类型-->实现Map.Entry(getKey,getValue)
            //向下转型
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());
        }
    }
}
