package com.zwy.pattern.tree.binarytree.threadTree.bridge;

import com.zwy.Util.MyUtil;
import com.zwy.pattern.linkedlist.simpleFactory.factory.Constant;
import com.zwy.pattern.linkedlist.simpleFactory.factory.LinkedList;
import com.zwy.pattern.linkedlist.simpleFactory.factory.LinkedListFactory;
import com.zwy.pattern.tree.binarytree.orderStrategy.IOrderStrategy;
import com.zwy.pattern.tree.binarytree.treeEntity.Tree;

/**
 * 链表和遍历 桥接
 * author:zwy
 * Date:2018/11/9
 * Time:17:00
 */
public class ThreadBridge {

    public LinkedList threadBridge(Tree tree, IOrderStrategy strategy){

        Integer[] array = strategy.operateAndReturn(tree);
        LinkedListFactory factory = new LinkedListFactory();
        LinkedList linkedList = factory.initLinkedList(Constant.DOUBLE, MyUtil.integerArrayToIntArray(array));
        return linkedList;
    }
}
