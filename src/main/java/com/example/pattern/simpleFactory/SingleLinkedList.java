package com.example.pattern.simpleFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/17
 * Time:17:10
 * 单链表
 */
public class SingleLinkedList extends LinkedList {

    private SingleLinkedList nextnode;  //下一个节点

    public SingleLinkedList getNextnode() {
        return nextnode;
    }

    public void setNextnode(SingleLinkedList nextnode) {
        this.nextnode = nextnode;
    }

    private final static Logger logger = LoggerFactory.getLogger(SingleLinkedList.class);

    @Override
    public LinkedList init(int[] datas) {

        //头部
        SingleLinkedList root = new SingleLinkedList();

        //当前节点
        SingleLinkedList currentNode;
        SingleLinkedList tmpNode;
        if(datas.length>0)
            root.setData(datas[0]);
        else
            return null;

        currentNode = root;
        for (int i = 1; i < datas.length; i++) {
            tmpNode = new SingleLinkedList();
            tmpNode.setData(datas[i]);
            currentNode.setNextnode(tmpNode);
            currentNode = tmpNode;
        }

        return root;
    }

    @Override
    public void ergodic(LinkedList linkedList) {
        if(linkedList==null)
            return;

        logger.info("值"+linkedList.getData());

        ergodic(((SingleLinkedList)linkedList).getNextnode());

    }

    @Override
    public void deleteNode(int dataNode, LinkedList linkedList) {

        SingleLinkedList singleLinkedList = (SingleLinkedList) linkedList;

        //头节点考虑
        if(dataNode==singleLinkedList.getData()){
            singleLinkedList = singleLinkedList.getNextnode();
            return;
        }

        if(singleLinkedList.getNextnode()==null) {
            logger.info("删除失败");
            return;
        }

        if(dataNode==singleLinkedList.getNextnode().getData()){
            singleLinkedList.setNextnode(singleLinkedList.getNextnode().getNextnode());
            return;
        }

        deleteNode(dataNode,singleLinkedList.getNextnode());


    }

    @Override
    public void insertNode(int dataNode, int data, LinkedList linkedList) {

        if(linkedList==null){
            SingleLinkedList newNode = new SingleLinkedList();
            newNode.setData(data);
            linkedList = newNode;
            return;
        }

        SingleLinkedList singleLinkedList =(SingleLinkedList) linkedList;

        if(singleLinkedList.getData()==dataNode){
            SingleLinkedList newNode = new SingleLinkedList();
            newNode.setData(data);
            newNode.setNextnode(singleLinkedList.getNextnode());
            singleLinkedList.setNextnode(newNode);
            return;
        }

        insertNode(dataNode,data,singleLinkedList.getNextnode());

    }
}
