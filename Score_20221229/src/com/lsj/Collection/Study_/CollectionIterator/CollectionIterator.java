package com.lsj.Collection.Study_.CollectionIterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 8:54
 * @description:
 */
/*
 Collection接口遍历元素方式1-使用Iterator（迭代器）
 1.Iterator对象成为迭代器，主要用于遍历Collection集合中的元素
 2.所有实现了Collection接口的集合类都有一个iterator()方法，泳衣返回一个实现了Iterator接口的对象，即可以返回一个迭代器
 3.Iterator的结构
 4.Iterator仅用于遍历集合，Iterator本身并不存放对象*/
//再调用it.next()方法之前必须要调用it.hasNext()进行检测。若不调用，
// 且下一条记录无效，直接调用next()会抛出NoSuchElementException异常
public class CollectionIterator {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Books("三国演义", "罗贯中",10.1));
        col.add(new Books("小李飞刀", "古龙",5.1));
        col.add(new Books("红楼梦", "曹雪芹",20.1));
        //System.out.println(col);
        //希望遍历集合
        //1.先得到col对应的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历即可
//        while (iterator.hasNext()){//判断是否还有数据
//            //返回下一个元素类型是Object
//            Object next = iterator.next();//运行类型取决于存放对象
//            System.out.println("Object="+next);
//        }
        //快捷键，快速生成while循环==>itit回车
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);
        }
        //3.当退出while循环后，这时iterator迭代器指向最后的元素
        //iterator.next();//抛异常
        //4.如果需要再次遍历怎么办？需要重置迭代器
        iterator = col.iterator();
        System.out.println("第二次遍历");
        while (iterator.hasNext()) {
            Object obj =  iterator.next();
            System.out.println(obj);

        }

    }
}
class Books{
    private String BookName;
    private String TorName;
    private double price;

    public Books(String bookName, String torName, double price) {
        BookName = bookName;
        TorName = torName;
        this.price = price;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getTorName() {
        return TorName;
    }

    public void setTorName(String torName) {
        TorName = torName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", TorName='" + TorName + '\'' +
                ", price=" + price +
                '}';
    }
}
