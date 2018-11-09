package com.zwy.pattern.linkedlist.simpleFactory.factory;

/**
 * 工厂抽象类
 * author:zwy
 * Date:2018/7/17
 * Time:17:03
 */
public abstract class LinkedList {
    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public abstract LinkedList init(int[] datas);

    public abstract void ergodic(LinkedList linkedList);

    public abstract void deleteNode(int dataNode,LinkedList linkedList);

    public abstract void insertNode(int dataNode,int data,LinkedList linkedList);
}
