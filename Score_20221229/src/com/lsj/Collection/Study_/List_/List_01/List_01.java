package com.lsj.Collection.Study_.List_.List_01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:00
 * @description:
 */
/*List接口基本介绍
 * List是Collection接口的子接口
 * 1.List集合类中元素有序（即添加顺序和取出顺序一致），且可重复
 * 2.List集合中的每个元素都有其对应的顺序索引，即支持索引
 * 3.List容器中的元素都对应一个整数型的序号记载其在容器中的位置，可以根据序号存取容器中的元素
 * 4.JDK API中List接口的实现类有很多*/
public class List_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List List = new ArrayList();
        List.add("jack");
        List.add("adad");
        List.add("mak");
        List.add("mak");
        //1.List集合类中元素有序（即添加顺序和取出顺序一致），且可重复
        System.out.println(List);
        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引
        System.out.println(List.get(0));//索引是从0开始
        System.out.println(List.get(2));
    }
}

