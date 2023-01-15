package com.lsj.Collection.Study_.Set_.LinkedHashSetExercise;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author: 罗仕杰
 * @date: 2023/1/11 15:09
 * @description:
 */
public class LinkedHashSetExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*Car类【属性name，price】，如果name和price一样
        * 则认为是相同元素，就不能添加
        * */
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓",1000));
        linkedHashSet.add(new Car("奥迪",3000000));
        linkedHashSet.add(new Car("法拉利",1000000000));
        linkedHashSet.add(new Car("奥迪",3000000));
        linkedHashSet.add(new Car("保时捷",700000000));
        linkedHashSet.add(new Car("奥迪",3000000));

        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}