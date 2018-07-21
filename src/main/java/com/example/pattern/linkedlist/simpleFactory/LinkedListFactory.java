package com.example.pattern.linkedlist.simpleFactory;

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
