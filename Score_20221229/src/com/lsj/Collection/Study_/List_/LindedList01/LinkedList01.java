package com.lsj.Collection.Study_.List_.LindedList01;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 9:05
 * @description:
 */
public class LinkedList01 {
    public static void main(String[] args) {
        //模拟简单的双向链表
        Node node = new Node("jack");
        Node node1 = new Node("tom");
        Node node2= new Node("switch");
        node.next = node1;
        node1.next = node2;
        node2.pre = node1;
        node1.pre = node;

        Node first = node;//让first引用指向第一个元素
        Node last = node2;//让last指向最后一个元素

        //演示从头到尾进行遍历
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //从尾到头遍历
        while(true){
            if(last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }
        //演示链表添加对象/数据方便性
        //在tom和switch之间插入一个对象
        Node node3 = new Node("刘备");
        node2.pre = node3;
        node1.next = node3;
        node3.next = node2;
        node3.pre = node1;
        first = node;
        while(true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

    }
}
//定义一个Node类，Node表示双向链表的节点
class Node{
    public Object item;//真正存放数据
    public Node next;//指向下一个节点
    public Node pre;//指向前一个节点
    public Node(Object name){
        this.item = name;
    }
    public String toString(){
        return"Node name"+item;
    }
}
