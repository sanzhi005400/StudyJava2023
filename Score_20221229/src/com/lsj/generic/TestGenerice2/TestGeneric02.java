package com.lsj.generic.TestGenerice2;

import java.util.*;

/**
 * @author: 罗仕杰
 * @date: 2023/1/15 11:53
 * @description:
 */
public class TestGeneric02 {
    public static void main(String[] args) {
        //1.HashSet
        Set<Student> students = new HashSet<>();
        students.add(new Student("john",12));
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student =  iterator.next();
            System.out.println(student);
        }

        //2.HashMap
        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        Student student = new Student("Aa",20);
        Student student1 = new Student("Bb",30);
        Student student2 = new Student("cc",10);
        stringStudentHashMap.put(student.name,student);
        stringStudentHashMap.put(student1.name,student1);
        stringStudentHashMap.put(student2.name,student2);
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Student> entry =  iterator1.next();
            System.out.println(entry);
        }
    }
}
class Student{
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}