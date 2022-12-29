package com.lsj.Collection.Study_.Set_.Set01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:15
 * @description:
 */
/*Set的基本用法7
1)无序 (添加和取出的顺序不一致） ，没有索引
2)不允许重复元素，所以最多包含“一个null
3) JDK API中Set接口的实现类有:
linkedHashSet,  TreSet等*/
public class Set_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //Set继承了Collection所以方法都是一样的
        Set setHash = new HashSet();
        setHash.add("jack");
        setHash.add("tom");
        setHash.add("刘备");
        setHash.add(null);

        //遍历只有iterator和增强for
        Iterator iterator = setHash.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
