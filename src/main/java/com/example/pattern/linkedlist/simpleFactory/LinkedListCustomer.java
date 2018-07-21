package com.example.pattern.linkedlist.simpleFactory;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:19:44
 */
public class LinkedListCustomer {

    public static void main(String[] args) {
        LinkedListFactory factory = new LinkedListFactory();
        LinkedList single = factory.initLinkedList(Constant.SINGLE,new int[]{1,2,3,4,5});

        single.deleteNode(9,single);
        single.ergodic(single);
    }
}
