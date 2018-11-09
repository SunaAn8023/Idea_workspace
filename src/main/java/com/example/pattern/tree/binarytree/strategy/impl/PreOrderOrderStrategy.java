package com.example.pattern.tree.binarytree.strategy.impl;

import com.example.pattern.tree.binarytree.treeEntity.Tree;
import com.example.pattern.tree.binarytree.strategy.IOrderStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * author:zwy
 * Date:2018/7/24
 * Time:11:12
 * 先序遍历
 */
public class PreOrderOrderStrategy implements IOrderStrategy {

    private final static Logger logger = LoggerFactory.getLogger(PreOrderOrderStrategy.class);

    @Override
    public void operate(Tree tree) {
        if(tree==null||tree.getData()==null||tree.getData()==0)
            return;

        logger.info("先序遍历递归算法，当前节点:"+tree.getData());
        operate(tree.getLeftchild());
        operate(tree.getRightchild());
    }
}
