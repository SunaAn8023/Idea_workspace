package com.example.pattern.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:17:19
 * 双链表
 */
public class DoubleLinkedList extends LinkedList {

    private DoubleLinkedList lastNode;  //上一个节点
    private DoubleLinkedList nextNode;  //下一个节点

    private final static Logger logger = LoggerFactory.getLogger(DoubleLinkedList.class);

    public DoubleLinkedList getLastNode() {
        return lastNode;
    }

    public void setLastNode(DoubleLinkedList lastNode) {
        this.lastNode = lastNode;
    }

    public DoubleLinkedList getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleLinkedList nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public LinkedList init(int[] datas) {

        DoubleLinkedList head = new DoubleLinkedList();
        DoubleLinkedList currentNode;
        DoubleLinkedList tmpNode;
        if(datas.length>0)
            head.setData(datas[0]);
        else
            return null;

        currentNode = head;
        for (int i = 1; i < datas.length; i++) {
            tmpNode = new DoubleLinkedList();
            tmpNode.setData(datas[i]);
            currentNode.setNextNode(tmpNode);
            tmpNode.setLastNode(currentNode);
            currentNode = tmpNode;
        }
        return head;
    }

    @Override
    public void ergodic(LinkedList linkedList) {

        if(linkedList==null)
            return;

        logger.info("值"+linkedList.getData());

        DoubleLinkedList doubleLinkedList = (DoubleLinkedList) linkedList;
        ergodic(doubleLinkedList.getNextNode());

    }

    @Override
    public void deleteNode(int dataNode, LinkedList linkedList) {


        DoubleLinkedList doubleLinkedList = (DoubleLinkedList) linkedList;

        //头节点考虑
        if(doubleLinkedList.getData() == dataNode){
            doubleLinkedList = doubleLinkedList.getNextNode();
            if(doubleLinkedList!=null)
                doubleLinkedList.setLastNode(null);
            return;
        }

        if(doubleLinkedList.getNextNode()==null){
            logger.info("删除失败");
            return;
        }

        if(doubleLinkedList.getNextNode().getData()==dataNode){
            doubleLinkedList.setNextNode(doubleLinkedList.getNextNode().getNextNode());
            if(doubleLinkedList.getNextNode()!=null)
                doubleLinkedList.getNextNode().setLastNode(doubleLinkedList);
            return;
        }

        deleteNode(dataNode,doubleLinkedList.getNextNode());
    }

    @Override
    public void insertNode(int dataNode, int data, LinkedList linkedList) {
        DoubleLinkedList doubleLinkedList = (DoubleLinkedList) linkedList;
        if(doubleLinkedList==null){
            doubleLinkedList = new DoubleLinkedList();
            doubleLinkedList.setData(data);
            return;
        }

        if(doubleLinkedList.getData()==dataNode){
            DoubleLinkedList newNode = new DoubleLinkedList();
            newNode.setData(data);
            newNode.setNextNode(doubleLinkedList.getNextNode());
            newNode.setLastNode(doubleLinkedList);
            doubleLinkedList.setNextNode(newNode);
            if (newNode.getNextNode()!=null){
                newNode.getNextNode().setLastNode(newNode);
            }
            return;
        }

        insertNode(dataNode,data,doubleLinkedList.getNextNode());
    }
}
