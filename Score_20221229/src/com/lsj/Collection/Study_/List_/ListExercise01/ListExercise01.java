package com.lsj.Collection.Study_.List_.ListExercise01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:01
 * @description:
 */
/*List接口练习
 * 1.添加是个以上的元素(比如String"hello")，在第二号位置插入一个元素"韩顺平教育",获得第五个元素，删除第六个元素，修改第七个元素，
 * 再使用迭代器遍历集合，要求使用List实现类ArrayList完成*/
public class ListExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("hello");
        arrayList.add("杰克");
        arrayList.add("张三");
        arrayList.add("李四");
        arrayList.add("王五");
        arrayList.add("刘柳");
        arrayList.add("罗琦");
        arrayList.add("小雅");
        arrayList.add("顺路有");
        arrayList.add("李小兰");
        System.out.println("========原有数据========");
        System.out.println(arrayList);
        System.out.println("========插入数据========");
        arrayList.add(1,"韩顺平教育");
        System.out.println(arrayList);
        System.out.println("========获得数据========");
        System.out.println(arrayList.get(4));
        System.out.println(arrayList);
        System.out.println("========删除第六个数据========");
        arrayList.remove(5);
        System.out.println(arrayList);
        System.out.println("========覆盖第七个数据========");
        arrayList.set(6,"王伟");
        System.out.println(arrayList);
        System.out.println("==========遍历数据======");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}

