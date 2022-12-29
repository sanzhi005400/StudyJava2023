package com.lsj.Integer.study.Wrapper_;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 8:09
 * @description:
 */
/*包装类和基本数据类型的相互转化，这里以int和Integer演示
* 1）jdk5前的手动装箱和拆箱方式：装箱：基本类型——》包装类型反之
* 2）jdk5以后的自动装箱和拆箱方式
* 3）自动装箱底层调用的是valueOf方法，比如Integer.valueOf()*/
public class Integer01 {
    public static void main(String[] args) {
        /*演示int<>Integer的装箱和拆箱
        jdk5前手动装箱和拆箱
        手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);已弃用
        Integer integer = new Integer(n1);
        integer.valueOf(n1);已弃用

        手动拆箱
        Integer->int
        int n1 = integer.intValue();
        手动装箱拆箱jdk19已经弃用*/

        //自动装箱
        //int——>Integer
        int n2 = 100;
        Integer integer1 = n2 ; //底层使用的是Integer.valueOf()方法
        //自动拆箱 Integer->int
        int n3 = integer1;
    }
}
