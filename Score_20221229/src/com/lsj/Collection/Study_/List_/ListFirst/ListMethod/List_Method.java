package com.lsj.Collection.Study_.List_.ListFirst.ListMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 8:57
 * @description:
 */
/*
 List常用方法
 1.void add(int index,Object ele)在index位置插入ele元素
 2.boolean addAA(int index,Collection eles)从index位置开始将eles中的所有元素添加进来
 3.Object get(int index)获取指定index位置的元素
 4.int indexOf(Object obj)返回obj在集合中首次出现的位置
 5.int lastIndexOf(Object obj)返回obj在当前集合中末次出现的位置
 6.object remove(int index)移除指定index位置的元素，并返回此元素
 7.object set(int index,object ele)设置指定index位置的元素为ele，相当于替换
 8.List subList(int fromIndex,int toIndex)返回从fromIndex到ToIndex位置的子集合*/
public class List_Method {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("张三丰");
        arrayList.add("贾宝玉");
        //1.void add(int index,Object ele)在index位置插入ele元素
        //在张三丰和贾宝玉之间插入一个对象（索引等于1）
        arrayList.add(1,"刘备");
        System.out.println(arrayList);
        //2.boolean addAA(int index,Collection eles)从index位置开始将eles中的所有元素添加进来
        Collection arrayList1 = new ArrayList();
        arrayList1.add("红楼梦");
        arrayList1.add("李四");
        arrayList.addAll(3,arrayList1);
        System.out.println(arrayList);
        //3.Object get(int index)获取指定index位置的元素
        System.out.println(arrayList.get(1));
        //4.int indexOf(Object obj)返回obj在集合中首次出现的位置,如果后面还有同名元素，不管
        System.out.println(arrayList.indexOf("李四"));
        //5.int lastIndexOf(Object obj)返回obj在当前集合中末次出现的位置
        arrayList.add("刘备");
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("刘备"));
        System.out.println(arrayList.lastIndexOf("刘备"));
        //6.object remove(int index)移除指定index位置的元素，并返回此元素
        arrayList.remove(5);
        System.out.println(arrayList);
        //7.object set(int index,object ele)设置指定index位置的元素为ele，相当于替换(索引必须存在，不能越界)
        arrayList.set(4,"张飞");
        System.out.println(arrayList);
        //8.List subList(int fromIndex,int toIndex)返回从fromIndex到ToIndex位置的子集合
        // (注意:前闭后开的范围)fromIndex<= subList < toIndex
        List return01 = arrayList.subList(0,3);
        System.out.println(arrayList);//[张三丰, 刘备, 贾宝玉, 红楼梦, 张飞]
        System.out.println(return01);//[张三丰, 刘备, 贾宝玉]
    }
}

