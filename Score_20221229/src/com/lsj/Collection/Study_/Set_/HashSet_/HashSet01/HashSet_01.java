package com.lsj.Collection.Study_.Set_.HashSet_.HashSet01;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:16
 * @description:
 */
/*1)HashSet实现了Set接口
 * 2)HashSet实际上是HashMap,看源码
 * 3)可以存放null值，但是也只能有一个null
 * 4）HashSet不保证元素是有序,取决于hash后,再确定索引的结果(即不保证存放元素的顺序和取出顺序一致)
 * 5)不能有重复元素/对象，在前面Set接口使用已经讲过*/
public class HashSet_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1.构造器走的源码 走的是以下
        //public HashSet() {
        //        map = new HashMap<>();
        //    }
        Set hashSet = new HashSet();

        //3)可以存放null值，但是也只能有一个null,元素不可以重复
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);//[null]

    }
}
