package com.lsj.Collection.Study_.HomeWork.Homework02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2023/1/14 21:12
 * @description:
 *//*使用ArrayList完成对对象Car {name, price}的各种操作
 1.add:添加单个元素
 2.remove:删除指定元素
 3.contains:查找元素是否存在
 4.size:获取元素个数
 5.isEmpty:判断是否为空
 6.clear:清空
 7.addAll:添加多个元素
 8.containsAll:查找多个元素是否都存在
 9.removeAll:删除多个元素
 使用增强for和迭代器来遍历所有的car，需要重写Car的toString方法
 Car car = new Car("宝马"，400000);
 Car car2 =new Car("宾利",5000000);
 */
public class HomeWork02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Car car = new Car("宝马",400000);
        Car car2 =new Car("宾利",5000000);
        List carlist = new ArrayList();
//        1.add:添加单个元素
        System.out.println("1.add:添加单个元素");
        carlist.add(car);
        carlist.add(car2);
        System.out.println(carlist);
//        2.remove:删除指定元素
        System.out.println("2.remove:删除指定元素");
        carlist.remove(0);
        System.out.println(carlist);
//        3.contains:查找元素是否存在
        System.out.println("3.contains:查找元素是否存在");
        System.out.println(carlist.contains(car));
//        4.size:获取元素个数
        System.out.println("4.size:获取元素个数");
        System.out.println(carlist.size());
//        5.isEmpty:判断是否为空
        System.out.println("5.isEmpty:判断是否为空");
        System.out.println(carlist.isEmpty());
//        6.clear:清空
        System.out.println("6.clear:清空");
        carlist.clear();
        System.out.println(carlist);
//        7.addAll:添加多个元素
        System.out.println("7.addAll:添加多个元素");
        ArrayList arrayList = new ArrayList();
        arrayList.add(car);
        arrayList.add(car2);
        carlist.addAll(arrayList);
        System.out.println(carlist);
//        8.containsAll:查找多个元素是否都存在
        System.out.println("8.containsAll:查找多个元素是否都存在");
        System.out.println(carlist.containsAll(arrayList));
//        9.removeAll:删除多个元素
        System.out.println("9.removeAll:删除多个元素");
        carlist.removeAll(arrayList);
        System.out.println(carlist);
//        使用增强for和迭代器来遍历所有的car，需要重写Car的toString方法
        carlist.addAll(arrayList);
        System.out.println("增强for");
        for (Object Cars :carlist) {
            System.out.println(Cars);
        }
        System.out.println("迭代器");
        Iterator iterator = carlist.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Car{
    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}