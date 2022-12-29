package com.lsj.Collection.Study_.CollectionFirst;

/*
  @author: 罗仕杰
 * @date: 2022/12/29 8:42
 * @description:
 */

import java.util.ArrayList;
import java.util.HashMap;
/*
  1.可以动态保存多个对象，使用比较方便
  2.提供了一系列方便的增删改查对象的方法：add。remove。set。get
  3.使用集合添加，删除元素的示意代码，简洁了
 */
/*public interface Collection<E> extends Iterable<E>
 * 1.collection实现子类可以存放多个元素，每个元素可以是Object
 * 2.有些Collection的实现类，可以存放重复的元素，有些不可以
 * 3.有些Collection的实现类，有些是有序的（List），有些不是有序的(Set)
 * 4.Collection接口没有直接的实现子类，是通过它的子接口Set和List来实现的*/

public class Collection{
    @SuppressWarnings({"all"})
//集合主要是两组（单列集合，双列集合）
// 2.Collection接口有两个重要的子接口 List Set，他们的实现子类都是单列集合
// 3.Map接口的实现子类是双列集合存放K-V
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("Number1","北京");
        hashMap.put("Number2","你爹");
    }
}
