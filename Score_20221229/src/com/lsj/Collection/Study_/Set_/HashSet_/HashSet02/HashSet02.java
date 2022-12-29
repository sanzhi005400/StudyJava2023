package com.lsj.Collection.Study_.Set_.HashSet_.HashSet02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:17
 * @description:
 */
public class HashSet02{
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set hashSet = new HashSet();

        //说明
        //1.在执行add方法后，会返回一个boolean
        //2.如果添加成功，返回true,否则返回false
        //3.可以通过remove指定删除哪个对象
        //4.HashSet不能添加相同的元素/数据？
        System.out.println(hashSet.add("jack"));//t
        System.out.println(hashSet.add("joi"));//t
        System.out.println(hashSet.add("luo"));//t
        System.out.println(hashSet.add("luo"));//f
        System.out.println(hashSet.add("ikun"));//t

        hashSet.remove("joi");
        System.out.println(hashSet);

        //4.
        hashSet = new HashSet();
        System.out.println(hashSet);//0个对象
        hashSet.add("lucy");//添加成功
        hashSet.add("lucy");//加入不了
        hashSet.add(new dog("小花"));//加入成功
        hashSet.add(new dog("小花"));//加入成功
        System.out.println(hashSet);

        //经典面试题
        //看源码，做分析,一个问题(未解决)
        //即add发生了什么————》底层机制
        hashSet.add(new String("lsj"));//加入成功
        hashSet.add(new String("lsj"));//加入不了。
        System.out.println(hashSet);
    }
}
class dog{//定义了dog类
    private String name;

    public dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "dog{" +
                "name='" + name + '\'' +
                '}';
    }
}