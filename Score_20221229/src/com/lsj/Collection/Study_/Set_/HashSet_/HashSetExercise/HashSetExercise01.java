package com.lsj.Collection.Study_.Set_.HashSet_.HashSetExercise;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: 罗仕杰
 * @date: 2023/1/4 19:07
 * @description:
 *//*1.先获取hashCode方法
 2.对哈希值进行运算，得出一个索引*/
public class HashSetExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //添加四个对象，判断
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jke",20));
        hashSet.add(new Employee("jke",20));
        hashSet.add(new Employee("luo",30));
        hashSet.add(new Employee("aio",40));

        //添加了几个元素
        System.out.println(hashSet);//添加了四个元素
    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //如果name和age值相同，返回相同的true
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    //如果name和age值相同，返回相同的hash值
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}