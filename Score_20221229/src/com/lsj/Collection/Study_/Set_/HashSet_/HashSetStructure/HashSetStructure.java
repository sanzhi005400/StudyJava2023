package com.lsj.Collection.Study_.Set_.HashSet_.HashSetStructure;

/**
 * @author: 罗仕杰
 * @date: 2022/12/29 15:45
 * @description:
 */
public class HashSetStructure {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //模拟HashSet的(HashMap)底层结构
        //1.创建一个数组,数组的类型是Node[]
        //2.有些人把Node数组称为表
        Node[] table = new Node[16];//
        System.out.println(table);
        //3.创建节点
        Node john = new Node("john",null);
        table[2] = john;
        Node luck = new Node("luck",null);
        table[3] = luck;
        Node jack = new Node("jack",null);
        john.next = jack;//将jack节点挂载到john
        Node rose = new Node("Rose",null);
        jack.next = rose;//将rose节点挂载到jack后
        System.out.println(table);
    }
}
class Node{//节点，存放数据，可以指向下一个节点,从而形成链表
    Object item;//存放数据
    Node next;//指向下一个节点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}