package com.lsj.Collection.Study_.List_.ArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:04
 * @description:
 */
/*1.ArrayList中维护了一个Object类型的数组elementData
transient Object[] elementData
* 2.当创建ArrayList对象时，如果使用的是无参构造器，则初始elementData容量为0，
* 第1次添加，则扩容elementDate为10，如需要再次扩容，则扩容elementData为1.5倍
* 3.如果使用的是指定大小的构造器，则初始elementData容量为指定大小*/
@SuppressWarnings({"all"})
/*
 1.permits all elements,including null,ArrayList可以加入null，并且多个
 2.ArrayList是由数组来实现数据存储的
 3.ArrayList基本等同于Vector，除了ArrayList是线程不安全(执行效率高)看源码，在多线程情况下，不建议使用ArrayList考虑用Vector*/
public class ArrayListDetail {
    public static void main(String[] args) {
        //除了ArrayList是线程不安全(执行效率高)看源码，在多线程情况下，不建议使用ArrayList
        //没有synchronized关键字修饰
        //public boolean add(E e) {
        //        ++this.modCount;
        //        this.add(e, this.elementData, this.size);
        //        return true;
        //    }
        List list = new ArrayList();
        //1.permits all elements,including null,ArrayList可以加入null，并且多个
        list.add("jack");
        list.add("tom");
        list.add(null);
        list.add(null);
        list.add(null);
    }
}

