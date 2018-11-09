package com.zwy.pattern.linkedlist.simpleFactory.consumer;

import com.zwy.pattern.linkedlist.simpleFactory.factory.Constant;
import com.zwy.pattern.linkedlist.simpleFactory.factory.LinkedList;
import com.zwy.pattern.linkedlist.simpleFactory.factory.LinkedListFactory;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:19:44
 */
public class LinkedListConsumer {

    public static void consume() {
        LinkedListFactory factory = new LinkedListFactory();
        LinkedList single = factory.initLinkedList(Constant.SINGLE,new int[]{1,2,3,4,5});

        single.deleteNode(9,single);
        single.ergodic(single);
    }
}
