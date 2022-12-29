package com.lsj.Collection.Study_.CollectionFor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 8:47
 * @description:
 */
/*Collection接口遍历对象方式2-for循环增强
 增强for循环，可以代替iterator迭代器，特点：增强for就是简化版的iterator，本质是一样。只能用于遍历集合或数组
 基本语法
 for(元素类型 元素名：集合名或数组名)}{
 访问元素
 }*/
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Books("三国演义", "罗贯中",10.1));
        col.add(new Books("小李飞刀", "古龙",5.1));
        col.add(new Books("红楼梦", "曹雪芹",20.1));

        //使用增强for循环
        //快捷方法I大写的i或iter
//        for (Object o :) {
//
//        }



        for(Object book:col){
            System.out.println("book="+book);
        }
        //2.底层是迭代器
        //3.可以理解成简化版的迭代器

        //增强for也可以直接在数组使用
//        int[] nums = {1,2,3,4,5,6};
//        for(int i:nums){
//            System.out.println("i="+i);
//        }
    }
}
class Books{
    private String name;
    private String autor;
    private double price;

    public Books(String name, String autor, double price) {
        this.name = name;
        this.autor = autor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
