package com.lsj.Collection.Study_.Set_.HashSet_.HashSetSource;

import java.util.HashSet;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 16:05
 * @description:
 */
public class HashSetSource {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        /*1.HashSet底层是HashMap
        * 2.添加一个元素时，先得到hash值--转换成-->索引值
        * 3.找到存储数据表table,看到这个索引位置是否已经存放的有元素
        * 4.如果没有，直接加入
        * 5.如果有，调用equals比较，如果相同，就放弃添加，如果不相同，则添加到最后
        * 6.在java8中，如果一条链表的元素个数超过TREEIFY_THRESHOLD(默认是8)，
        * 并且table的大小>=MIN_TREEIFY_CAPACITY(默认是64),就会进行树化,红黑树*/

        HashSet hashSet = new HashSet();
        hashSet.add("java");
        hashSet.add("php");
        hashSet.add("java");
        System.out.println(hashSet);

        /*源码解读
        * 1.执行了HashSet()构造器
        *
        * public HashSet() {
        map = new HashMap<>();
    }
    *
    * 2.执行add
    *  public boolean add(E e) {
        return map.put(e, PRESENT)==null;//T
        *
        *private static final Object PRESENT = new Object();
        * 为了站位没什么意义，为了HashSet使用到HashMap
    }
    * 3.执行add里的put方法
    * public V put(K key, V value) {
        return putVal(hash(key), key, value, false, true);
    }
    * 4.算出hash值的hash(key)方法得到K对应的hash值，不完全等于hashcode
    * static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);//算法，可以让不同的K尽量得到随机值
    }
    * 5.进入核心代码putVal方法
    * final V putVal(int hash, K key, V value, boolean onlyIfAbsent,
                   boolean evict) {
        Node<K,V>[] tab; Node<K,V> p; int n, i;//定义了辅助变量
        * //if语句表示如果当前table是null或者大小为=0
        * //就是第一次扩容，扩大16空间
        if ((tab = table) == null || (n = tab.length) == 0)
        * //table就是HashMap的数组,类型是Node[]
            n = (tab = resize()).length;//进入resize方法,源码在第六步
            * //根据key，得到hash去计算该key应该存放到table表的那个索引位置

        if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
            * //并且吧这个位置的对象，赋给辅助变量p
            * //判断p是否为null，表示还没有存放元素，就创建一个Node
            * //放在该位置table[i]
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                        p.next = newNode(hash, key, value, null);
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);//空方法，是Hashmap留给子类如 LinkedMap实现用的
        * //主要是为了让子类实现一个如有序的列表什么的
        return null;//返回空是证明成功
    }
    *
    * 6.final Node<K,V>[] resize() {
        Node<K,V>[] oldTab = table;
        int oldCap = (oldTab == null) ? 0 : oldTab.length;
        int oldThr = threshold;
        int newCap, newThr = 0;
        if (oldCap > 0) {
            if (oldCap >= MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTab;
            }
            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                     oldCap >= DEFAULT_INITIAL_CAPACITY)
                newThr = oldThr << 1; // double threshold
        }
        else if (oldThr > 0) // initial capacity was placed in threshold
            newCap = oldThr;
        else {               // zero initial threshold signifies using defaults
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }
        if (newThr == 0) {
            float ft = (float)newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                      (int)ft : Integer.MAX_VALUE);
        }
        threshold = newThr;
        @SuppressWarnings({"rawtypes","unchecked"})
        Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        table = newTab;
        if (oldTab != null) {
            for (int j = 0; j < oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) != null) {
                    oldTab[j] = null;
                    if (e.next == null)
                        newTab[e.hash & (newCap - 1)] = e;
                    else if (e instanceof TreeNode)
                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node<K,V> loHead = null, loTail = null;
                        Node<K,V> hiHead = null, hiTail = null;
                        Node<K,V> next;
                        do {
                            next = e.next;
                            if ((e.hash & oldCap) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTab[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTab[j + oldCap] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab;
    }
*/
    }
}
