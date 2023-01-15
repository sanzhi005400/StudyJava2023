package com.lsj.Collection.Study_.Set_.HashSet_.HashSetExercise02;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author: 罗仕杰
 * @date: 2023/1/4 19:29
 * @description:
 */
public class HashSetExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*1.创建3个em类型放入hash中
        * 2.当name和bir的值相同时，认为是相同的员，不能添加到集合*/
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack",2000,new MyDate(22,1,25)));
        hashSet.add(new Employee("jack",4000,new MyDate(22,1,25)));
        hashSet.add(new Employee("smith",4000,new MyDate(22,10,25)));
        System.out.println(hashSet);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(o == null || getClass() != o.getClass())return false;
        Employee employee = (Employee) o;
        return Objects.equals(name,employee.name) && Objects.equals(birthday,employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,birthday);
    }
}
class MyDate{
    private int year;
    private int moth;
    private int day;

    public MyDate(int year, int moth, int day) {
        this.year = year;
        this.moth = moth;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMoth() {
        return moth;
    }

    public void setMoth(int moth) {
        this.moth = moth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "{" +
                "year=" + year +
                ", moth=" + moth +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && moth == myDate.moth && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, moth, day);
    }
}