package com.lsj.Collection.Study_.HomeWork.HomeWork04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.SplittableRandom;

/**
 * @author: 罗仕杰
 * @date: 2023/1/15 11:33
 * @description:
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");
        HashSet arrayList = new HashSet();
        arrayList.add(p1);
        arrayList.add(p2);
        p1.name = "CC";
        arrayList.remove(p1);
        System.out.println(arrayList);
        arrayList.add(new Person(1001,"CC"));
        System.out.println(arrayList);
        arrayList.add(new Person(1001,"AA"));
        System.out.println(arrayList);
    }
}
class Person{
     int id;
     String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}