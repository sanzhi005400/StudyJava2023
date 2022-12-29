package com.lsj.Collection.Study_.List_.ListExercise02;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:01
 * @description:
 */
/*1.铵价格排序，从低到高，冒泡排序
 * 2.要求使用ArrayList，LinkedList，Vector三种集合实现
 * 3.结论：主要说明，只要实现了List接口，那么List的实现类都可以使用List接口中的方法*/
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List list = new Vector();
        //List list = new LinkedList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",9));
        list.add(new Book("三国演义","罗贯中",80));
        list.add(new Book("西游记","吴承恩",10));

        for(Object obj:list){
            System.out.println(obj);
        }
        sort(list);//1.铵价格排序，从低到高，冒泡排序

        System.out.println("============================");
        Iterator listIt = list.iterator();
        while(listIt.hasNext()){
            Object obj = listIt.next();
            System.out.println(obj);
        }
    }
    //静态方法排序
    public static void sort(List list){
        int listSize = list.size();
        for(int i = 0;i < listSize - 1;i++){
            for (int j = 0;j < listSize - 1- i;j++){
                //先取出对象Book
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if(book1.getPrice() > book2.getPrice()){
                    //交换
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
class Book{
    private String name;
    private String torName;
    private double price;

    public Book(String name, String torName, double price) {
        this.name = name;
        this.torName = torName;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTorName() {
        return torName;
    }

    public void setTorName(String torName) {
        this.torName = torName;
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
                "name='" + name + '\'' +
                ", torName='" + torName + '\'' +
                ", price=" + price +
                '}';
    }
}
