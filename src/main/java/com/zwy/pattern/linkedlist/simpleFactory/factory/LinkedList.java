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


    /**
     * 初始化链表
     * @param datas
     * @return
     */
    public abstract LinkedList init(int[] datas);

    /**
     * 遍历链表
     * @param linkedList    对象本身
     */
    public abstract void ergodic(LinkedList linkedList);

    /**
     * 删除节点
     * @param dataNode
     * @param linkedList    对象本身
     */
    public abstract void deleteNode(int dataNode,LinkedList linkedList);

    /**
     * 添加节点
     * @param dataNode
     * @param data
     * @param linkedList    对象本身
     */
    public abstract void insertNode(int dataNode,int data,LinkedList linkedList);
}
