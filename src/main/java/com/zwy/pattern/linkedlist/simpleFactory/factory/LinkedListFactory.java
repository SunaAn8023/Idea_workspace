package com.zwy.pattern.linkedlist.simpleFactory.factory;

import com.zwy.pattern.linkedlist.simpleFactory.factory.impl.DoubleLinkedList;
import com.zwy.pattern.linkedlist.simpleFactory.factory.impl.SingleLinkedList;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:17:33
 */
public class LinkedListFactory {

    public LinkedList initLinkedList(int name,int[] datas){

        if(name==0)
            return new SingleLinkedList().init(datas);
        if(name==1)
            return new DoubleLinkedList().init(datas);

        return null;
    }
}
