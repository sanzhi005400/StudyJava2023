package com.lsj.Map_.Study_.Map01_;

import java.util.HashMap;

/**
 * @author: 罗仕杰
 * @date: 2023/1/11 15:54
 * @description:
 */
public class Map_01 {
    /*Map接口的特点
    这里是jdk8的Map接口
    * 1.Map与Collection并列存在。用于保存具有映射关系的数据:Key—Value
    2.Map中的key和value可以是任何引用类型的数据，会封装到HashMap$Node对象中
    3..Map中的key不允许重复，原因和HashSet一样
    4.Map中的values可以重复
    5.Map的key可以为null，value也可以为null，注意key为null，只能有一个，value为null可以有多个
    6.常用的String类作为Map的key(大部分)
    7.key和values之间存在单向一对一关系，即通过指定的key总能找到对应的value
    8.Map存放数据的key-value示意图,一对k-v是存在一个Node中的，又因为Node实现了Entry接口，
    有些书也说一对k-v就是一个Entry
    （Node是个HashMap里面的内部类）*/
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("no1","lsj");//key-value
        hashMap.put("no2","zwj");//key-value
        hashMap.put("no1","wli");//k如果重复了，就会替换掉数据
        hashMap.put("no3","aoi");//v重复了，会添加而不是替换
        hashMap.put(null,null);
        hashMap.put(null,"你诶的");
        hashMap.put("no4",null);

        System.out.println(hashMap);
        System.out.println(hashMap.get("no1"));
    }
}

