package com.lsj.generic.improve;

/**
 * @author: 罗仕杰
 * @date: 2023/1/15 11:40
 * @description:
 */
/*泛型=广泛的数据类型
1.泛型又称为参数类型，是jdk5.0出现的新特性，解决数据类型的安全性问题
* 2。在类声明或实例化时只要指定好需要的具体的类型即可
* 3.java泛型可以保证如果程序在编译时没有发出警告，运行时就不会产生ClassCastException异常
* 4.*/
public class Generic02 {
    public static void main(String[] args) {
        Person<String> stringPerson = new Person<String>("HSP");
        /*
        * 就好像上面的Person类所有类型变成String
        *
        * 复用性和泛用性
        * */
    }
}
class Person<E>{
    E s;//E表示 s的数据类型，该数据类型在定义Person对象的时候指定的，即在编译期间，就确定E是什么类型

    public Person(E s) {
        this.s = s;
    }
    public E f(){
        return s;
    }
}