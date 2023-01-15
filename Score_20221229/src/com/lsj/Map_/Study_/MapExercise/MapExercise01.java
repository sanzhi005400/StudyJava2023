package com.lsj.Map_.Study_.MapExercise;

import java.util.*;

/**
 * @author: 罗仕杰
 * @date: 2023/1/11 18:25
 * @description:
 */
/*使用HashMap添加三个对象，要求
* 键:员工id
* 值:员工对象
* 并遍历显示工资>18000的员工(遍历方式最少两种)
* 员工类:姓名，工资，员工id*/
public class MapExercise01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(Employee.id, new Employee("jack", 20000));
        map.put(Employee.id, new Employee("switch", 10000));
        map.put(Employee.id, new Employee("jom", 30000));

        //第一种遍历
        System.out.println("第一种遍历");
        Collection values = map.values();
        for (Object value : values) {
            Employee e = (Employee) value;
            if (((Employee) value).getSal() > 18000) {
                System.out.println(value);
            }
        }
        //第二种遍历
        System.out.println("第二种遍历");
        Set hashMap = map.keySet();
        Iterator iterator = hashMap.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Employee e = (Employee) map.get(key);
            if(e.getSal() > 18000){
                System.out.println(key + "-" + e);
            }
        }

        //第三种遍历
        System.out.println("第三种遍历");
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator1.next();
            //通过entry取得k和v
            Employee employee = (Employee) entry.getValue();
            if (employee.getSal() > 18000) {
                System.out.println(employee);
            }
        }

        }


}

class Employee{
    private String name;
    private double sal;
    public static  Integer id = 0;

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Employee.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}